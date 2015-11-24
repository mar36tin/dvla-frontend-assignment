package service

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers


class LookUpServiceSpec extends FunSpec with ShouldMatchers {

  object TestLookUpService extends LookUpService

  describe("LookUpService") {
    it ("verifies if a vehicle is registered and returns the right vehicle details") {
      val regVehicle = TestLookUpService.lookUp("SF11THG").get
      regVehicle should have('vehicleReg ("SF11THG"), 'make ("Nissan"), 'v5c ("123456789602"))
    }

    it ("returns no result if the vehicle cannot be found") {
      val regVehicle = TestLookUpService.lookUp("SF09THG")
      regVehicle should be (None)
    }

    it ("returns no result if the vehicle cannot be found") {
      val regVehicle = TestLookUpService.lookUp("SF09THG")
      regVehicle should be (None)
    }
  }
}

