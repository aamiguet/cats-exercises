package sandbox.monoid

import cats.Monoid

case class Order(totalCost: Double, quantity: Double)

object Order {
  implicit val OrderMonoid: Monoid[Order] = new Monoid[Order] {
    def combine(x: Order, y: Order) = Order(x.totalCost + y.totalCost, x.quantity + y.quantity)
    def empty = Order(0, 0)
  }
}