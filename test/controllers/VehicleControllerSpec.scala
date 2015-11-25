package controllers

import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.play.{OneServerPerSuite, PlaySpec}
import play.api.i18n.MessagesApi
import play.api.i18n.{Messages, MessagesApi}
import play.api.mvc.Result
import play.api.test.FakeRequest
import play.api.test.Helpers._
import play.i18n.MessagesApi

import scala.concurrent.Future

class VehicleControllerSpec extends PlaySpec with OneServerPerSuite with ScalaFutures {


  "startnow" should {
    "load the start now page" in {
      val result: Future[Result] = .search(FakeRequest())
      status(result) must be(OK)

            contentAsString(result) must include("Registration number")
    }
  }
}