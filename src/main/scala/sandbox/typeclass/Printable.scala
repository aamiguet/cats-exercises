package sandbox.typeclass

trait Printable[A] {
  def format(value: A): String

  def print(value: A): Unit = println(format(value))
}

object Printable {
  def format[A](value: A)(implicit p: Printable[A]): String =
    p.format(value)

  def print[A](value: A)(implicit p: Printable[A]): Unit =
    p.print(value)
}