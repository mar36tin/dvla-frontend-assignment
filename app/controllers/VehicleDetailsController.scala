package controllers


import play.api.mvc._
import service._

import scala.concurrent.Future

class VehicleDetailsController extends Controller {

  val lookUpService = new LookUpService

  def getVehicle(vehicleReg: String) = Action.async { implicit request =>

    lookUpService.lookUp(vehicleReg) match {
      case Some(vehicleDetails) => Future.successful(Ok(views.html.vehicle(vehicleDetails)))
      case _ => Future.successful(Ok(views.html.nodetails()))
    }
  }
}