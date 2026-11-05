package fp

/** Part 6 — Writing higher-order functions (20 min)
  *
  * A higher-order function (HOF) takes a function as parameter and/or returns a function.
  *
  * RULE: in the extension methods below, do NOT use the built-in `map`, `filter`, `foldLeft`,
  * `exists` or `flatMap`. Use pattern matching and recursion.
  */
object Ex06HigherOrder:

  extension [A](xs: List[A])

    /** Example (solved): applies f to each element. */
    def myForeach(f: A => Unit): Unit =
      xs match
        case Nil          => ()
        case head :: tail => f(head); tail.myForeach(f)

    def myMap[B](f: A => B): List[B] =
      ???

    def myFilter(p: A => Boolean): List[A] =
      ???

    def myFoldLeft[B](z: B)(op: (B, A) => B): B =
      ???

    def myExists(p: A => Boolean): Boolean =
      ???

    /** Hint: you may use `++` (or your `concat` from Part 4). */
    def myFlatMap[B](f: A => List[B]): List[B] =
      ???

  /** `map` written with `myFoldLeft` only (you may use `reverse`). */
  def mapViaFold[A, B](xs: List[A])(f: A => B): List[B] =
    ???

  /** `filter` written with `myFoldLeft` only (you may use `reverse`). */
  def filterViaFold[A](xs: List[A])(p: A => Boolean): List[A] =
    ???

  /** Returns a function adding n. */
  def adder(n: Int): Int => Int =
    ???

  /** Returns a function multiplying by n. */
  def multiplier(n: Int): Int => Int =
    ???

  /** f after g: x => f(g(x)). Do not use the built-in `compose` / `andThen`. */
  def compose[A, B, C](f: B => C, g: A => B): A => C =
    ???

  /** Returns a function applying f twice. */
  def twice[A](f: A => A): A => A =
    ???

  /** Chains all functions, from left to right: composeAll(List(f, g))(x) == g(f(x)).
    * The empty list gives the identity function.
    */
  def composeAll[A](fs: List[A => A]): A => A =
    ???

  /** Turns a two-parameter function into a chain of one-parameter functions. */
  def curry[A, B, C](f: (A, B) => C): A => B => C =
    ???

  /** The inverse of curry. */
  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    ???

  /** A predicate that is true when ALL predicates are true (true for an empty list). */
  def allOf[A](ps: List[A => Boolean]): A => Boolean =
    ???

  /** ⭐ Bonus: returns a function counting the elements satisfying p. */
  def countWhere[A](p: A => Boolean): List[A] => Int =
    ???
