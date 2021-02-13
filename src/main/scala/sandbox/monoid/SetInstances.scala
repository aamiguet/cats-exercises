package sandbox.monoid

object SetInstances {
  implicit def setConcatMonoid[A]: Monoid[Set[A]] =
    new Monoid[Set[A]] {
      def combine(x: Set[A], y: Set[A]) = x ++ y
      def empty = Set.empty[A]
    }
}