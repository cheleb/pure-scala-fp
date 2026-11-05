package fp

import Ex07Capstone.*
import Data.csv

class Ex07CapstoneSuite extends munit.FunSuite:

  test("parseGrades"):
    assertEquals(parseGrades("12,15,9"), Some(List(12, 15, 9)))
    assertEquals(parseGrades(""), Some(Nil))
    assertEquals(parseGrades("12,x"), None)
    assertEquals(parseGrades("21"), None)
    assertEquals(parseGrades("-1"), None)

  test("parseLine"):
    assertEquals(parseLine("Alice;A;15,18"), Some(Student("Alice", "A", List(15, 18))))
    assertEquals(parseLine("Gaëlle;A;"), Some(Student("Gaëlle", "A", Nil)))
    assertEquals(parseLine("broken line"), None)
    assertEquals(parseLine(";B;10"), None)
    assertEquals(parseLine("David;C;5,x,6"), None)
    assertEquals(parseLine("Too;many;fields;here"), None)

  test("parseAll"):
    assertEquals(
      parseAll(csv).map(_.name),
      List("Alice", "Bob", "Chloé", "Emma", "Hugo", "Inès", "Gaëlle")
    )

  test("invalidLines"):
    assertEquals(invalidLines(csv), List("broken line", "David;C;5,x,6", ";B;10"))

  test("groupRanking"):
    val ranking = groupRanking(parseAll(csv))
    assertEquals(ranking.keySet, Set("A", "B", "C"))
    assertEquals(ranking("A").map(_._1), List("Chloé", "Alice"))
    assertEquals(ranking("B").map(_._1), List("Hugo", "Emma", "Bob"))
    assertEquals(ranking("C").map(_._1), List("Inès"))

  test("report"):
    val expected =
      """Group A: Chloé (18.67), Alice (15.00)
        |Group B: Hugo (17.67), Emma (14.33), Bob (9.33)
        |Group C: Inès (13.00)
        |Invalid lines: 3""".stripMargin
    assertEquals(report(csv), expected)
