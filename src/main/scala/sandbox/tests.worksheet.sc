import cats._
import cats.implicits._

case class Order(totalCost: Double, quantity: Double)

object Order {
  implicit val orderMonoid = Monoid.instance[Order](
    Order(0, 0),
    (o1, o2) => Order(o1.totalCost + o2.totalCost, o1.quantity + o2.quantity)
  )
}

/*
def add(items: List[Option[Int]]): Option[Int] =
  items.foldLeft(Monoid[Option[Int]].empty)(_ |+| _)*/

def add[T: Monoid](items: List[T]): T =
  items.foldLeft(Monoid[T].empty)(_ |+| _)

add(List(3, 4))

add(List(Option(1), Option(2), Option(3)))

add(List(Order(2d, 10d), Order(3d, 11d)))

val func1: Int => Double =
  (x: Int) => x.toDouble
val func2: Double => Double =
  (y: Double) => y * 2

val composed = func1 andThen func2

composed(2)

val comp2 = func2(func1(2))

case class Box[A](value: A)

implicit val boxFunctor = new Functor[Box] {
  def map[A, B](value: Box[A])(func: A => B): Box[B] =
    Box(func(value.value))
}

val box = Box[Int](123)

box.map(value => value + 1)
