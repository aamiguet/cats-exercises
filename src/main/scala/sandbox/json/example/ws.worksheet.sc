import sandbox.json.example._

import sandbox.json.example.implicits._
import sandbox.json.JsUtil._

val visitors: Seq[Visitor] =
  Seq(
    Anonymous("001"),
    User("003", "dave@xample.com")
  )

visitors.map(_.toJson)

