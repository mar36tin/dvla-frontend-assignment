package controllers

import play.api._
import play.api.mvc._
import play.api.i18n._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.{Constraint, Invalid, Valid}
import play.api.libs.json.Json
import models._
import service._
import scala.concurrent.{ExecutionContext, Future }

import javax.inject._

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