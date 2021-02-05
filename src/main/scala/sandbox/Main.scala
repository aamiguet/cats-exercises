package sandbox

//import cats.instances.string._
//import cats.syntax.semigroup._

import sandbox.typeclass.Cat
import sandbox.typeclass.Printable

object Main extends App {
  val cat = Cat("Garfield", 25, "orange")

  Printable.print(cat);
}
