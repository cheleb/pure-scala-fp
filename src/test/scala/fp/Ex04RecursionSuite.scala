package fp

import Ex04Recursion.*

class Ex04RecursionSuite extends munit.FunSuite:

  val big: List[Int] = List.fill(100_000)(1)

  test("length (example)"):
    assertEquals(length(List(1, 2, 3)), 3)
    assertEquals(length(Nil), 0)

  test("sum"):
    assertEquals(sum(List(1, 2, 3)), 6)
    assertEquals(sum(Nil), 0)

  test("sumTail (stack safe)"):
    assertEquals(sumTail(List(1, 2, 3)), 6)
    assertEquals(sumTail(big), 100_000)

  test("last"):
    assertEquals(last(List(1, 2, 3)), Some(3))
    assertEquals(last(Nil), None)

  test("contains"):
    assert(contains(List(1, 2, 3), 2))
    assert(!contains(List(1, 2, 3), 4))
    assert(!contains(Nil, 1))

  test("reverse (stack safe)"):
    assertEquals(reverse(List(1, 2, 3)), List(3, 2, 1))
    assertEquals(reverse(Nil), Nil)
    assertEquals(length(reverse(big).take(1)), 1)

  test("concat"):
    assertEquals(concat(List(1, 2), List(3, 4)), List(1, 2, 3, 4))
    assertEquals(concat(Nil, List(1)), List(1))

  test("compress"):
    assertEquals(compress(List(1, 1, 2, 3, 3, 3, 1)), List(1, 2, 3, 1))
    assertEquals(compress("aaabccd".toList).mkString, "abcd")
    assertEquals(compress(Nil), Nil)

  test("⭐ fibonacci"):
    assertEquals(fibonacci(0), BigInt(0))
    assertEquals(fibonacci(1), BigInt(1))
    assertEquals(fibonacci(10), BigInt(55))
    assertEquals(fibonacci(100), BigInt("354224848179261915075"))
