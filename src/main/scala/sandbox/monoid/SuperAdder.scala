package sandbox.monoid

import cats.Monoid
import cats.syntax.semigroup._

object SuperAdder {
  def add[A](items: List[A])(implicit monoid: Monoid[A]): A = items.foldLeft(monoid.empty)(_ |+| _)
}