package fp

import Ex05Functions.*

class Ex05FunctionsSuite extends munit.FunSuite:

  test("double (example)"):
    assertEquals(double(21), 42)

  test("increment"):
    assertEquals(increment(1), 2)

  test("isEven"):
    assert(isEven(4))
    assert(!isEven(3))

  test("add"):
    assertEquals(add(2, 3), 5)

  test("applyTwice"):
    assertEquals(applyTwice(_ * 10, 1), 100)
    assertEquals(applyTwice(_ - 1, 0), -2)

  test("applyAll"):
    assertEquals(applyAll(List(_ + 1, _ * 2), 5), List(6, 10))
    assertEquals(applyAll(Nil, 5), Nil)

  test("operations"):
    assertEquals(operations.keySet, Set("+", "-", "*"))

  test("calculate"):
    assertEquals(calculate("+", 2, 3), Some(5))
    assertEquals(calculate("-", 2, 3), Some(-1))
    assertEquals(calculate("*", 2, 3), Some(6))
    assertEquals(calculate("/", 2, 3), None)

  test("tripleAll"):
    assertEquals(tripleAll(List(1, 2)), List(3, 6))

  test("⭐ applyN"):
    assertEquals(applyN(_ + 2, 5, 0), 10)
    assertEquals(applyN(_ + 2, 0, 7), 7)
