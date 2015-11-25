package controllers

import javax.inject._

import play.api.i18n._
import play.api.mvc._
import forms.VehicleDetailsForm._

import scala.concurrent.{ExecutionContext, Future}

class VehicleController @Inject()( val messagesApi: MessagesApi)
                                 (implicit ec: ExecutionContext) extends Controller with I18nSupport {

  def search = Action {
    Ok(views.html.index(vehicleDetailsForm))
  }

  def retrieveVehicle = Action.async { implicit request =>
    vehicleDetailsForm.bindFromRequest.fold(
      formWithErrors => {
        Future.successful(BadRequest(views.html.index(formWithErrors)))
      },
      vehicle => {
          Future.successful(Redirect(routes.VehicleDetailsController.getVehicle(vehicle.vehicleReg)))
      }
    )
  }
}

