package fp

/** Part 3 — Aggregations (20 min)
  *
  * `foldLeft`, `sum`, `maxByOption`, `groupBy`, `groupMapReduce`, `partition`, `sortBy`,
  * `sliding`, `scanLeft`.
  */
object Ex03Aggregations:

  /** Example (solved): sum with a fold. */
  def total(xs: List[Int]): Int =
    xs.foldLeft(0)(_ + _)

  /** Given helper: lower-cased words of a text. */
  def words(text: String): List[String] =
    text.toLowerCase.split("[^\\p{L}]+").toList.filter(_.nonEmpty)

  /** Average of a list, None if empty. */
  def average(xs: List[Int]): Option[Double] =
    ???

  /** The student with the best average (students without grades are ignored). */
  def bestStudent(students: List[Student]): Option[Student] =
    ???

  /** Number of students per group. Hint: `groupMapReduce`. */
  def countByGroup(students: List[Student]): Map[String, Int] =
    ???

  /** Average of ALL the grades of each group. */
  def averageByGroup(students: List[Student]): Map[String, Double] =
    ???

  /** (names with average >= 10, the others). Students without grades fail. */
  def passFail(students: List[Student]): (List[String], List[String]) =
    ???

  /** Number of occurrences of each word. Use [[words]]. */
  def wordCount(text: String): Map[String, Int] =
    ???

  /** The `n` most frequent words, by decreasing count then alphabetical order. */
  def topWords(text: String, n: Int): List[(String, Int)] =
    ???

  /** (name, average) sorted by decreasing average; students without grades are ignored. */
  def ranking(students: List[Student]): List[(String, Double)] =
    ???

  /** How many times a value is strictly greater than the previous one. Hint: `sliding(2)`. */
  def countIncreases(xs: List[Int]): Int =
    ???

  /** ⭐ Bonus: running totals, e.g. List(1, 2, 3) => List(1, 3, 6). Hint: `scanLeft`. */
  def runningTotal(xs: List[Int]): List[Int] =
    ???

  /** ⭐ Bonus: the most frequent letter (case-insensitive), None if there is no letter. */
  def mostFrequentLetter(s: String): Option[Char] =
    ???
