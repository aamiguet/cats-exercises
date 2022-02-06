import cats.implicits._

import sandbox.functor._
import sandbox.functor.Printable._
import sandbox.functor.PrintableInstances._

Tree.leaf(100).map(_ * 2)
Tree.branch(Tree.leaf(10), Tree.leaf(20)).map(_ * 2)

format(Box(true))
format(Box("Hello world!"))

