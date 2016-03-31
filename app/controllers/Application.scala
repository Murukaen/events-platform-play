package controllers

import models.Event
import org.joda.time.DateTime
import play.api._
import play.api.mvc._

class Application extends Controller {

  def getDummyEvents = {
    Seq(
      new Event("Concert Bla-Bla", DateTime.now, "Casino"),
      new Event("Vernisaj", DateTime.now, "Muzeul de Arta"),
      new Event("Targ Something", DateTime.now, "Piata Unirii")
    )
  }

  def index = Action {
    val events = getDummyEvents
    Ok(views.html.index("Your new application is ready, boss.")(events))
  }

}