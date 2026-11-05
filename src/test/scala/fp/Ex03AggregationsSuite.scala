package fp

import Ex03Aggregations.*
import Data.{students, text}

class Ex03AggregationsSuite extends munit.FunSuite:

  test("total (example)"):
    assertEquals(total(List(1, 2, 3)), 6)

  test("average"):
    assertEquals(average(List(10, 20)), Some(15.0))
    assertEquals(average(Nil), None)

  test("bestStudent"):
    assertEquals(bestStudent(students).map(_.name), Some("Chloé"))
    assertEquals(bestStudent(Nil), None)

  test("countByGroup"):
    assertEquals(countByGroup(students), Map("A" -> 4, "B" -> 3, "C" -> 3))

  test("averageByGroup"):
    val obtained = averageByGroup(students)
    assertEquals(obtained.keySet, Set("A", "B", "C"))
    assertEqualsDouble(obtained("A"), 128.0 / 9, 1e-9)
    assertEqualsDouble(obtained("B"), 124.0 / 9, 1e-9)
    assertEqualsDouble(obtained("C"), 88.0 / 9, 1e-9)

  test("passFail"):
    assertEquals(
      passFail(students),
      (
        List("Alice", "Chloé", "Emma", "Farid", "Hugo", "Inès"),
        List("Bob", "David", "Gaëlle", "Jules")
      )
    )

  test("wordCount"):
    val counts = wordCount(text)
    assertEquals(counts.size, 12)
    assertEquals(counts("values"), 3)
    assertEquals(counts("functions"), 2)
    assertEquals(counts("simpler"), 1)

  test("topWords"):
    assertEquals(topWords(text, 3), List("values" -> 3, "are" -> 2, "functions" -> 2))

  test("ranking"):
    val obtained = ranking(students)
    assertEquals(
      obtained.map(_._1),
      List("Chloé", "Hugo", "Alice", "Emma", "Inès", "Farid", "Bob", "Jules", "David")
    )
    assertEqualsDouble(obtained.head._2, 56.0 / 3, 1e-9)

  test("countIncreases"):
    assertEquals(countIncreases(List(1, 3, 2, 4, 5)), 3)
    assertEquals(countIncreases(List(1)), 0)
    assertEquals(countIncreases(Nil), 0)

  test("⭐ runningTotal"):
    assertEquals(runningTotal(List(1, 2, 3)), List(1, 3, 6))
    assertEquals(runningTotal(Nil), Nil)

  test("⭐ mostFrequentLetter"):
    assertEquals(mostFrequentLetter("Abracadabra!"), Some('a'))
    assertEquals(mostFrequentLetter("123 !"), None)
