package controllers

import javax.inject._

import play.api.i18n._
import play.api.mvc._
import service._

import scala.concurrent.{ExecutionContext, Future}

class VehicleDetailsController @Inject()( val messagesApi: MessagesApi)
                                  (implicit ec: ExecutionContext) extends Controller with I18nSupport {

  val lookUpService = new LookUpService

  def getVehicle(vehicleReg: String) = Action.async { implicit request =>

    lookUpService.lookUp(vehicleReg) match {
      case Some(vehicleDetails) => Future.successful(Ok(views.html.vehicle(vehicleDetails)))
      case _ => Future.successful(Ok(views.html.nodetails()))
    }
  }
}