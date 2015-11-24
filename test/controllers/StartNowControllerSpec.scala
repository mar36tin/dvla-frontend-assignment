package controllers

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

class StartNowControllerSpec extends FunSpec with FunSpec  with  ShouldMatchers {

  object TestStartNowController extends StartNowController


  describe("StartNowController") {
    it ("verifies if a vehicle is registered and returns the right vehicle details") {
      val startPage = TestStartNowController.start
      startPage should include
    }

  }

}