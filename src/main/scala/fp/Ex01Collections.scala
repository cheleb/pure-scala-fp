package fp

/** Part 1 — Collections basics (15 min)
  *
  * Immutable collections: `List`, `Vector`, `Set`, `Map` and `Option`.
  *
  * Useful methods: `headOption`, `drop`, `take`, `takeRight`, `reverse`, `toSet`, `size`, `get`,
  * `getOrElse`, `+`, `intersect`, `:+`, `++`.
  */
object Ex01Collections:

  /** Example (solved): the first element of a list, if any. */
  def firstElement[A](xs: List[A]): Option[A] =
    xs.headOption

  /** The second element of a list, if any. */
  def secondElement[A](xs: List[A]): Option[A] =
    ???

  /** The last `n` elements of a list (the whole list if it is shorter). */
  def lastN[A](xs: List[A], n: Int): List[A] =
    ???

  /** Number of distinct elements. */
  def distinctCount[A](xs: List[A]): Int =
    ???

  /** true when the list reads the same forwards and backwards. */
  def isPalindrome[A](xs: List[A]): Boolean =
    ???

  /** The age of `name`, if known. */
  def lookupAge(ages: Map[String, Int], name: String): Option[Int] =
    ???

  /** The age of `name`, or 0 if unknown. */
  def ageOrZero(ages: Map[String, Int], name: String): Int =
    ???

  /** A new map where `name` is associated with `age` (added or replaced). */
  def addOrUpdate(ages: Map[String, Int], name: String, age: Int): Map[String, Int] =
    ???

  /** Elements present in both sets. */
  def commonElements[A](a: Set[A], b: Set[A]): Set[A] =
    ???

  /** A new vector with `a` inserted at index `i`. Hint: `take`, `drop`, `:+`, `++`. */
  def insertAt[A](v: Vector[A], i: Int, a: A): Vector[A] =
    ???

  /** ⭐ Bonus: integer division that does not crash on 0. */
  def safeDivide(a: Int, b: Int): Option[Int] =
    ???
