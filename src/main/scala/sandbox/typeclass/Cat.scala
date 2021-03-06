package sandbox.typeclass

import PrintableInstances._

import cats.Show
import cats.Eq
import cats.instances.string._
import cats.instances.int._
import cats.syntax.show._
import cats.syntax.eq._

final case class Cat(name: String, age: Int, color: String)

object Cat {
  implicit val catPrintable: Printable[Cat] =
    new Printable[Cat] {
      def format(cat: Cat) =
        s"${Printable.format(cat.name)} is a ${Printable.format(cat.age)} year-old ${Printable.format(cat.color)} cat."
    }

  implicit val catShow: Show[Cat] =
    Show.show(cat => s"${cat.name.show} is a ${cat.age.show} year-old ${cat.color.show} cat.")

  implicit val catEq: Eq[Cat] =
    Eq.instance((x: Cat, y: Cat) => x.name === y.name && x.age === y.age && x.color === y.color)
}