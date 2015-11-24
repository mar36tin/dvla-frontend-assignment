package controllers

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{FunSpec, GivenWhenThen}
import org.scalatest.{GivenWhenThen, FunSpec}
import play.api.mvc.{AnyContent, Action}
import models.VehicleDetails
import controllers.StartNowController

class StartNowControllerSpec extends FunSpec with FlatSpec  with WebBrowser with ShouldMatchers {

  object TestStartNowController extends StartNowController

  implicit val webDriver: WebDriver = new HtmlUnitDriver

  val host = "http://localhost:9000/"

  "The DVLA StartNow page" should "have the correct title" in {
    go to (host)
//    pageTitle should be ("Start now")
  }

//  describe("StartNowController") {
//    it("displays the StartNow button") {
//      val regVehicle = TestLookUpService.lookUp("SF11THG").get
//      regVehicle should have('vehicleReg ("SF11THG"), 'make ("Nissan"), 'v5c ("123456789602"))
//    }
//  }



}

//
//class BlogSpec extends FlatSpec with ShouldMatchers with WebBrowser {
//
//  implicit val webDriver: WebDriver = new HtmlUnitDriver
//
//  val host = "http://localhost:9000/"
//
//  "The blog app home page" should "have the correct title" in {
//    go to (host + "index.html")
//    pageTitle should be ("Awesome Blog")
//  }
//}