package sandbox.json

trait JsWriter[A] {
  def write(data: A): JsValue
}