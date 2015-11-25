package models

import play.api.libs.json._

case class VehicleDetails(vehicleReg: String, make: String, v5c: Option[String])

object VehicleDetails {
  
  implicit val vehicleDetailsFormat = Json.format[VehicleDetails]
}