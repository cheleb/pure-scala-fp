package fp

import Ex00Warmup.*

class Ex00WarmupSuite extends munit.FunSuite:

  test("greet"):
    assertEquals(greet("Scala"), "Hello, Scala!")

  test("isAdult"):
    assert(isAdult(18))
    assert(isAdult(42))
    assert(!isAdult(17))
