package sandbox.monoid

object BooleanInstances {
  implicit val booleanAndMonoid: Monoid[Boolean] =
    new Monoid[Boolean] {
      def combine(x: Boolean, y: Boolean) = x && y
      def empty = true
    }

  implicit val booleanOrMonoid: Monoid[Boolean] =
    new Monoid[Boolean] {
      def combine(x: Boolean, y: Boolean) = x || y
      def empty = false
    }

  implicit val booleanXorMonoid: Monoid[Boolean] =
    new Monoid[Boolean] {
      def combine(x: Boolean, y: Boolean) = (!x && y) || (x && !y)
      def empty = false
    }

  implicit val booleanXnorMonoid: Monoid[Boolean] =
    new Monoid[Boolean] {
      def combine(x: Boolean, y: Boolean) = (!x || y) && (x || !y)
      def empty = true
    }
}