package fp

/** A student with a name, a group ("A", "B" or "C") and a list of grades (out of 20). */
case class Student(name: String, group: String, grades: List[Int])

/** Shared dataset used throughout the exercises. Do not modify. */
object Data:

  val students: List[Student] = List(
    Student("Alice", "A", List(15, 18, 12)),
    Student("Bob", "B", List(8, 9, 11)),
    Student("Chloé", "A", List(17, 19, 20)),
    Student("David", "C", List(5, 7, 6)),
    Student("Emma", "B", List(14, 13, 16)),
    Student("Farid", "C", List(10, 12, 9)),
    Student("Gaëlle", "A", List()),
    Student("Hugo", "B", List(19, 16, 18)),
    Student("Inès", "C", List(13, 11, 15)),
    Student("Jules", "A", List(9, 10, 8))
  )

  val text: String =
    "Functional programming is programming with functions. " +
      "Functions are values, and values are immutable. " +
      "Immutable values make programs simpler."

  /** Raw CSV lines `name;group;grade1,grade2,...` — some of them are invalid. */
  val csv: List[String] = List(
    "Alice;A;15,18,12",
    "Bob;B;8,9,11",
    "broken line",
    "Chloé;A;17,19,20",
    "David;C;5,x,6",
    "Emma;B;14,13,16",
    ";B;10",
    "Hugo;B;19,16,18",
    "Inès;C;13,11,15",
    "Gaëlle;A;"
  )
