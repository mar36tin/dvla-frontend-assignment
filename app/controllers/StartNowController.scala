package controllers

import play.api.mvc._

class StartNowController extends Controller {

  def start = Action { implicit request =>
    Ok(views.html.startnow())
  }


}