import cats.implicits._

import sandbox.functor._
import sandbox.functor.Printable._
import sandbox.functor.PrintableInstances._
import sandbox.functor.Codec._
import sandbox.functor.CodecInstances._

Tree.leaf(100).map(_ * 2)
Tree.branch(Tree.leaf(10), Tree.leaf(20)).map(_ * 2)

format(Box(true))
format(Box("Hello world!"))

encode(123.4d)
decode[Double]("123.4")

encode(Box(true))
decode[Box[Boolean]]("false")
