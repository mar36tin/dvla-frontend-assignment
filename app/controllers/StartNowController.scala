package controllers

import javax.inject._

import play.api.i18n._
import play.api.mvc._

import scala.concurrent.ExecutionContext

class StartNowController @Inject()( val messagesApi: MessagesApi)
                                 (implicit ec: ExecutionContext) extends Controller with I18nSupport{

  def start = Action { implicit request =>
    Ok(views.html.startnow())
  }
}