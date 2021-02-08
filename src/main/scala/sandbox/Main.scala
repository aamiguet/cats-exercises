package sandbox

//import cats.instances.string._
//import cats.syntax.semigroup._

import cats.syntax.show._
import cats.syntax.eq._
import cats.syntax.option._

import cats.instances.option._

import sandbox.typeclass.Cat
import sandbox.typeclass.PrintableSyntax._

object Main extends App {
  val cat = Cat("Garfield", 14, "orange")
  cat.print
  println(cat.show)

  val cat1 = Cat("Garfield", 38,"orange and black")
  val cat2 = Cat("Heathcliff", 33,"orange and black")

  println(cat1 === cat2)
  println(cat1 === cat1)
  println(none[Cat] === none[Cat])
  println(cat1.some =!= cat2.some)
  println(cat1.some === cat1.some)
}
