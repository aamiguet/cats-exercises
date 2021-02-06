package sandbox

//import cats.instances.string._
//import cats.syntax.semigroup._

import sandbox.typeclass.Cat
import sandbox.typeclass.PrintableSyntax._

object Main extends App {
  Cat("Garfield", 14, "orange").print
}
