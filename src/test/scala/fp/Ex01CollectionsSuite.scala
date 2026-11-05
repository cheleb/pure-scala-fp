package fp

import Ex01Collections.*

class Ex01CollectionsSuite extends munit.FunSuite:

  test("firstElement (example)"):
    assertEquals(firstElement(List(1, 2, 3)), Some(1))
    assertEquals(firstElement(List.empty[Int]), None)

  test("secondElement"):
    assertEquals(secondElement(List(1, 2, 3)), Some(2))
    assertEquals(secondElement(List(1)), None)
    assertEquals(secondElement(List.empty[Int]), None)

  test("lastN"):
    assertEquals(lastN(List(1, 2, 3, 4), 2), List(3, 4))
    assertEquals(lastN(List(1), 5), List(1))
    assertEquals(lastN(List(1, 2), 0), Nil)

  test("distinctCount"):
    assertEquals(distinctCount(List(1, 2, 2, 3, 3, 3)), 3)
    assertEquals(distinctCount(List.empty[Int]), 0)

  test("isPalindrome"):
    assert(isPalindrome(List(1, 2, 1)))
    assert(isPalindrome("kayak".toList))
    assert(isPalindrome(List.empty[Int]))
    assert(!isPalindrome(List(1, 2)))

  val ages = Map("Alice" -> 21, "Bob" -> 19)

  test("lookupAge"):
    assertEquals(lookupAge(ages, "Alice"), Some(21))
    assertEquals(lookupAge(ages, "Zoé"), None)

  test("ageOrZero"):
    assertEquals(ageOrZero(ages, "Bob"), 19)
    assertEquals(ageOrZero(ages, "Zoé"), 0)

  test("addOrUpdate"):
    assertEquals(addOrUpdate(ages, "Bob", 20), Map("Alice" -> 21, "Bob" -> 20))
    assertEquals(addOrUpdate(ages, "Zoé", 18), Map("Alice" -> 21, "Bob" -> 19, "Zoé" -> 18))
    assertEquals(ages("Bob"), 19, "the original map must not change")

  test("commonElements"):
    assertEquals(commonElements(Set(1, 2, 3), Set(2, 3, 4)), Set(2, 3))
    assertEquals(commonElements(Set(1), Set(2)), Set.empty[Int])

  test("insertAt"):
    assertEquals(insertAt(Vector(1, 2, 4), 2, 3), Vector(1, 2, 3, 4))
    assertEquals(insertAt(Vector(2, 3), 0, 1), Vector(1, 2, 3))
    assertEquals(insertAt(Vector(1, 2), 2, 3), Vector(1, 2, 3))

  test("⭐ safeDivide"):
    assertEquals(safeDivide(6, 3), Some(2))
    assertEquals(safeDivide(1, 0), None)
