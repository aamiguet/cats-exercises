package sandbox.functor

trait Printable[A] { self =>

  def format(value: A): String

  def contramap[B](func: B => A): Printable[B] =
    new Printable[B] {
      def format(value: B): String = {
        self.format(func(value))
      }
    }
}

object Printable {
  def format[A](value: A)(implicit printable: Printable[A]): String =
    printable.format(value)
}

object PrintableInstances {
  implicit val stringPrintable: Printable[String] = {
    new Printable[String] {
      def format(value: String): String = s"'${value}'"
    }
  }

  implicit val booleanPrintable: Printable[Boolean] = {
    new Printable[Boolean] {
      def format(value: Boolean): String =
        if (value) "yes" else "no"
    }
  }

}