package forms

import models.VehicleDetails
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.{Invalid, Valid, Constraint}
import utils.Regex

object VehicleDetailsForm {

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
    "v5c" -> optional(text)
  )(VehicleDetails.apply)(VehicleDetails.unapply)
    .verifying(vehicleRegEmptyConstraint)
    .verifying(makeEmptyConstraint)
    .verifying(vehicleRegValidConstraint)
  )

}
