package sandbox.json.example

import java.util.Date
import sandbox.json._
import sandbox.json.JsUtil._

object implicits {
  implicit val stringWriter = new JsWriter[String] {
    def write(data: String): JsValue =
      JsString(data)
  }

  implicit val dateWriter = new JsWriter[Date] {
    def write(data: Date): JsValue =
      data.toString.toJson
  }

  implicit val anonymousWriter = new JsWriter[Anonymous] {
    def write(data: Anonymous): JsValue =
      JsObject(
        Map(
          "id" -> data.id.toJson,
          "createdAt" -> data.createdAt.toJson
        )
      )
  }

  implicit val userWriter = new JsWriter[User] {
    def write(data: User): JsValue =
      JsObject(
        Map(
          "id" -> data.id.toJson,
          "email" -> data.email.toJson,
          "createdAt" -> data.createdAt.toJson
        )
      )
  }

  implicit val VisitorWriter = new JsWriter[Visitor] {
    def write(data: Visitor) = data match {
      case anon: Anonymous => anon.toJson
      case user: User => user.toJson
    }
  }

}
