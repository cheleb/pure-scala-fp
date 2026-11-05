package fp

/** Part 5 — Functions as values (10 min)
  *
  * A function is a value of type `A => B` (or `(A, B) => C`, ...). It can be stored in a
  * variable, a collection, passed as a parameter...
  *
  * Note: the definitions below are `def`s that RETURN a function (so that `???` does not crash
  * the whole object). Write a lambda, e.g. `x => x * 2`, or `_ * 2`.
  */
object Ex05Functions:

  /** Example (solved). */
  def double: Int => Int =
    x => x * 2

  /** Adds 1. */
  def increment: Int => Int =
    ???

  /** true for even numbers. */
  def isEven: Int => Boolean =
    ???

  /** A function with two parameters adding them. */
  def add: (Int, Int) => Int =
    ???

  /** Applies `f` twice: f(f(x)). */
  def applyTwice(f: Int => Int, x: Int): Int =
    ???

  /** Applies every function of `fs` to `x`. */
  def applyAll(fs: List[Int => Int], x: Int): List[Int] =
    ???

  /** Operators "+", "-" and "*" stored in a Map. */
  def operations: Map[String, (Int, Int) => Int] =
    ???

  /** Applies the operator `op` (looked up in [[operations]]) to a and b, None if unknown. */
  def calculate(op: String, a: Int, b: Int): Option[Int] =
    ???

  /** A method (not a function value). */
  def triple(x: Int): Int = x * 3

  /** Multiplies every element by 3, passing the METHOD `triple` directly to `map` (eta-expansion). */
  def tripleAll(xs: List[Int]): List[Int] =
    ???

  /** ⭐ Bonus: applies `f` n times to x (recursively). */
  def applyN(f: Int => Int, n: Int, x: Int): Int =
    ???
