package sandbox.functor

final case class Box[A](value: A)

object Box {
  implicit def boxPrintable[A](implicit printable: Printable[A]) =
    printable.contramap[Box[A]](_.value)
}