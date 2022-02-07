package sandbox.functor

final case class Box[A](value: A)

object Box {
  implicit def boxPrintable[A](implicit printable: Printable[A]) =
    printable.contramap[Box[A]](_.value)

  implicit def boxCodec[A](implicit codec: Codec[A]) =
    codec.imap[Box[A]](Box(_), _.value)
}