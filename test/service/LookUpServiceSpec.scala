package service

import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.play.{OneServerPerSuite, PlaySpec}


class LookUpServiceSpec extends PlaySpec with OneServerPerSuite with ScalaFutures {

  object TestLookUpService extends LookUpService

  "LookUpService" should {
    "verifies if a vehicle is registered and returns the right vehicle details" in {
      val regVehicle = TestLookUpService.lookUp("SF11THG").get
      regVehicle.vehicleReg must be ("SF11THG")
      regVehicle.make must be ("Nissan")
      regVehicle.v5c must be ("123456789602")
    }
  }

  "LookUpService" should {
    "returns no result if the vehicle cannot be found" in {
      val regVehicle = TestLookUpService.lookUp("SF09THG")
      regVehicle must be(None)
    }
  }
}

