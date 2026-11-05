package fp

import Ex02Transformations.*
import Data.students

class Ex02TransformationsSuite extends munit.FunSuite:

  test("names (example)"):
    assertEquals(names(students).take(2), List("Alice", "Bob"))

  test("groupNames"):
    assertEquals(groupNames(students, "A"), List("Alice", "Chloé", "Gaëlle", "Jules"))
    assertEquals(groupNames(students, "Z"), Nil)

  test("passing"):
    assertEquals(passing(students, 12), List("Alice", "Chloé", "Emma", "Hugo"))
    assertEquals(passing(students, 0).size, 9, "students without grades never pass")

  test("allGrades"):
    val few = List(Student("x", "A", List(1, 2)), Student("y", "B", List(3)))
    assertEquals(allGrades(few), List(1, 2, 3))
    assertEquals(allGrades(students).size, 27)

  test("studentsWithoutGrades"):
    assertEquals(studentsWithoutGrades(students), List("Gaëlle"))

  test("parseInts"):
    assertEquals(parseInts(List("1", "a", "3", "", "-4")), List(1, 3, -4))

  test("pairs"):
    assertEquals(
      pairs(List(1, 2), List("a", "b")),
      List((1, "a"), (1, "b"), (2, "a"), (2, "b"))
    )
    assertEquals(pairs(List(1), List.empty[String]), Nil)

  test("pythagoreanTriples"):
    assertEquals(pythagoreanTriples(15), List((3, 4, 5), (5, 12, 13), (6, 8, 10), (9, 12, 15)))

  test("initials"):
    assertEquals(initials(students), "ABCDEFGHIJ")

  test("collectEvenSquares"):
    assertEquals(collectEvenSquares(List(1, 2, 3, 4)), List(4, 16))

  test("⭐ flattenOptions"):
    assertEquals(flattenOptions(List(Some(1), None, Some(3))), List(1, 3))
