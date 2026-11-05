package fp

/** Part 7 — Capstone: a report pipeline (15 min)
  *
  * Input: CSV lines `name;group;grade1,grade2,...` (see [[Data.csv]]). Some lines are invalid.
  * Output: a text report, built only with the tools seen so far (no `var`, no loops).
  *
  * Expected report for [[Data.csv]]:
  * {{{
  * Group A: Chloé (18.67), Alice (15.00)
  * Group B: Hugo (17.67), Emma (14.33), Bob (9.33)
  * Group C: Inès (13.00)
  * Invalid lines: 3
  * }}}
  */
object Ex07Capstone:

  /** Given helper: formats a Double with 2 decimals, independently of the machine locale. */
  def fmt(d: Double): String = "%.2f".formatLocal(java.util.Locale.ROOT, d)

  /** Parses "12,15,9" into its grades. An empty string means no grade (Some(Nil)).
    * None if any grade is not an integer or is outside [0, 20].
    */
  def parseGrades(s: String): Option[List[Int]] =
    ???

  /** Parses one line. None if it does not have exactly 3 fields, if the name or the group is
    * empty, or if the grades are invalid.
    *
    * Hint: `line.split(";", -1)` keeps trailing empty fields ("Gaëlle;A;" has 3 fields).
    */
  def parseLine(line: String): Option[Student] =
    ???

  /** All the valid students. */
  def parseAll(lines: List[String]): List[Student] =
    ???

  /** The lines that cannot be parsed. */
  def invalidLines(lines: List[String]): List[String] =
    ???

  /** For each group: (name, average) sorted by decreasing average. Students without grades are
    * ignored. Reuse `Ex03Aggregations.average`.
    */
  def groupRanking(students: List[Student]): Map[String, List[(String, Double)]] =
    ???

  /** The full report (see the object documentation), groups in alphabetical order, lines
    * separated by "\n". Use [[fmt]] for the averages.
    */
  def report(lines: List[String]): String =
    ???
