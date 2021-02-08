package sandbox

//import cats.instances.string._
//import cats.syntax.semigroup._

import cats.syntax.show._

import sandbox.typeclass.Cat
import sandbox.typeclass.PrintableSyntax._

object Main extends App {
  val cat = Cat("Garfield", 14, "orange")
  cat.print
  println(cat.show)
}
