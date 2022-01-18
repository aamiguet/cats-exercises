package sandbox.json

object JsUtil {
  def toJson[A](data: A)(implicit writer: JsWriter[A]): JsValue =
    writer.write(data)

  implicit class JsOps[A](data: A) {
    def toJson(implicit writer: JsWriter[A]): JsValue =
      writer.write(data)
  }
}
