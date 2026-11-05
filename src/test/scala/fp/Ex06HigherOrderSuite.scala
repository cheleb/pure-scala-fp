package fp

import Ex06HigherOrder.*

class Ex06HigherOrderSuite extends munit.FunSuite:

  test("myMap"):
    assertEquals(List(1, 2, 3).myMap(_ * 2), List(2, 4, 6))
    assertEquals(List(1, 2).myMap(_.toString), List("1", "2"))
    assertEquals(List.empty[Int].myMap(_ * 2), Nil)

  test("myFilter"):
    assertEquals(List(1, 2, 3, 4).myFilter(_ % 2 == 0), List(2, 4))
    assertEquals(List.empty[Int].myFilter(_ > 0), Nil)

  test("myFoldLeft"):
    assertEquals(List("a", "b", "c").myFoldLeft("")(_ + _), "abc")
    assertEquals(List(1, 2, 3).myFoldLeft(0)(_ - _), -6)
    assertEquals(List.empty[Int].myFoldLeft(42)(_ + _), 42)

  test("myExists"):
    assert(List(1, 2, 3).myExists(_ > 2))
    assert(!List(1, 2, 3).myExists(_ > 3))
    assert(!List.empty[Int].myExists(_ => true))

  test("myFlatMap"):
    assertEquals(List(1, 2).myFlatMap(x => List(x, x)), List(1, 1, 2, 2))
    assertEquals(List(1, 2).myFlatMap(_ => Nil), Nil)

  test("mapViaFold"):
    assertEquals(mapViaFold(List(1, 2, 3))(_ + 1), List(2, 3, 4))

  test("filterViaFold"):
    assertEquals(filterViaFold(List(1, 2, 3, 4))(_ > 2), List(3, 4))

  test("adder / multiplier"):
    assertEquals(adder(3)(4), 7)
    assertEquals(multiplier(3)(4), 12)
    assertEquals(List(1, 2).map(adder(10)), List(11, 12))

  test("compose"):
    val f: Int => Int = _ + 1
    val g: Int => Int = _ * 2
    assertEquals(compose(f, g)(5), 11)
    assertEquals(compose((n: Int) => n.toString, (s: String) => s.length)("hello"), "5")

  test("twice"):
    assertEquals(twice[Int](_ + 3)(0), 6)
    assertEquals(twice[String](_ + "!")("hi"), "hi!!")

  test("composeAll"):
    assertEquals(composeAll[Int](List(_ + 1, _ * 2))(5), 12)
    assertEquals(composeAll[Int](Nil)(5), 5)

  test("curry / uncurry"):
    val minus = (a: Int, b: Int) => a - b
    assertEquals(curry(minus)(10)(3), 7)
    assertEquals(uncurry(curry(minus))(10, 3), 7)

  test("allOf"):
    val positiveEven = allOf[Int](List(_ > 0, _ % 2 == 0))
    assert(positiveEven(4))
    assert(!positiveEven(3))
    assert(!positiveEven(-2))
    assert(allOf[Int](Nil)(0))

  test("⭐ countWhere"):
    assertEquals(countWhere[Int](_ > 2)(List(1, 2, 3, 4)), 2)
