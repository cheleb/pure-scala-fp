package fp

import scala.annotation.tailrec

/** Part 4 — Recursion and pattern matching (15 min)
  *
  * RULE: no library collection methods here (no `size`, `sum`, `reverse`, `last`, `map`, ...).
  * Only pattern matching on `Nil` and `head :: tail`, and recursion.
  *
  * Use `@tailrec` when asked: the compiler then checks that the call is in tail position.
  */
object Ex04Recursion:

  /** Example (solved): length of a list. */
  def length[A](xs: List[A]): Int =
    xs match
      case Nil       => 0
      case _ :: tail => 1 + length(tail)

  /** Sum of a list (simple recursion). */
  def sum(xs: List[Int]): Int =
    ???

  /** Sum of a list, tail-recursive (must work on 100 000 elements). Use an inner `@tailrec` helper with an accumulator. */
  def sumTail(xs: List[Int]): Int =
    ???

  /** The last element, if any. Make it tail-recursive and add `@tailrec` above the `def`. */
  def last[A](xs: List[A]): Option[A] =
    ???

  /** true if `a` is in the list. Make it tail-recursive and add `@tailrec` above the `def`. */
  def contains[A](xs: List[A], a: A): Boolean =
    ???

  /** Reverses a list, tail-recursive (must work on 100 000 elements). */
  def reverse[A](xs: List[A]): List[A] =
    ???

  /** xs followed by ys. */
  def concat[A](xs: List[A], ys: List[A]): List[A] =
    ???

  /** Removes consecutive duplicates: List(1, 1, 2, 3, 3, 1) => List(1, 2, 3, 1). */
  def compress[A](xs: List[A]): List[A] =
    ???

  /** ⭐ Bonus: n-th Fibonacci number (fib(0) = 0, fib(1) = 1), tail-recursive. */
  def fibonacci(n: Int): BigInt =
    ???
