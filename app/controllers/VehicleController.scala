package controllers

import javax.inject._

import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.{Constraint, Invalid, Valid}
import play.api.i18n._
import play.api.mvc._
import utils.Regex

import scala.concurrent.{ExecutionContext, Future}

class VehicleController @Inject()( val messagesApi: MessagesApi)
                                 (implicit ec: ExecutionContext) extends Controller with I18nSupport {


    val vehicleRegEmptyConstraint: Constraint[VehicleDetails] = Constraint("error.vehicleReg_empty")({ model =>
      model.vehicleReg.nonEmpty match {
        case true => Valid
        case false => Invalid("error.vehicleReg_empty", "vehicleReg")
      }
    })

    val makeEmptyConstraint: Constraint[VehicleDetails] = Constraint("error.make_empty")({ model =>
      model.make.nonEmpty match {
        case true => Valid
        case false => Invalid("error.make_empty", "make")
      }
    })

    val vehicleRegValidConstraint: Constraint[VehicleDetails] = Constraint("error.vehicleReg_invalid")({ model =>
      model.vehicleReg.isEmpty || (model.vehicleReg.nonEmpty && model.vehicleReg.matches(Regex.vehicleNumberRegex)) match {
        case true => Valid
        case false => Invalid("error.vehicleReg_invalid", "vehicleReg")
      }
    })

    val vehicleDetailsForm: Form[VehicleDetails] = Form(mapping(
      "vehicleReg" -> text,
      "make" -> text,
      "v5c" -> text
    )(VehicleDetails.apply)(VehicleDetails.unapply)
      .verifying(vehicleRegEmptyConstraint)
      .verifying(makeEmptyConstraint)
      .verifying(vehicleRegValidConstraint)
    )

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

