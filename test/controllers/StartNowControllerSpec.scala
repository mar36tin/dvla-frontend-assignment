package controllers
import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.play.{OneServerPerSuite, PlaySpec}
import play.api.mvc.Result
import play.api.test.FakeRequest
import play.api.test.Helpers._

import scala.concurrent.Future

class StartNowControllerSpec extends PlaySpec with OneServerPerSuite with ScalaFutures {

  object TestStartNowController extends StartNowController

  "startnow" should {
      "load the start now page" in {
        val result: Future[Result] = TestStartNowController.start(FakeRequest())
        status(result) must be(OK)
      }
  }
}