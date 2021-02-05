package sandbox.typeclass

import PrintableInstances._

final case class Cat(name: String, age: Int, color: String)

object Cat {
  implicit val catPrintable: Printable[Cat] =
    new Printable[Cat] {
      def format(value: Cat) =
        s"${Printable.format(value.name)} is a ${Printable.format(value.age)} year-old ${Printable.format(value.color)} cat."
    }
}