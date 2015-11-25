package controllers

import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.play.{OneServerPerSuite, PlaySpec}
import play.api.mvc.Result
import play.api.test.FakeRequest
import play.api.test.Helpers._

import scala.concurrent.Future

class VehicleDetailsControllerSpec extends PlaySpec with OneServerPerSuite with ScalaFutures {

  object TestVehicleDetailsController extends VehicleDetailsController

  "Vehicle Details" should {
    "returns a registered vehicle" in {
      val vehicleReg = "DF61HNT"
      val result: Future[Result] = TestVehicleDetailsController.getVehicle(vehicleReg)(FakeRequest())
      status(result) must be(OK)
    }
  }
}