package controllers

import play.api._
import play.api.mvc._
import play.api.i18n._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.{Constraint, Invalid, Valid}
import play.api.libs.json.Json
import models._
import service._
import scala.concurrent.{ExecutionContext, Future }

import javax.inject._

class StartNowController @Inject()( val messagesApi: MessagesApi)
                                 (implicit ec: ExecutionContext) extends Controller with I18nSupport{

  def start = Action {
    Ok(views.html.startnow())
  }
}