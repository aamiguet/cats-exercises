package sandbox

import cats.Functor

package object functor {

  implicit val treeFunctor: Functor[Tree] =
    new Functor[Tree] {
      def map[A, B](tree: Tree[A])(func: A => B): Tree[B] = tree match {
        case Branch(l, r) => Branch(map(l)(func), map(r)(func))
        case Leaf(v) => Leaf(func(v))
      }
    }

}
