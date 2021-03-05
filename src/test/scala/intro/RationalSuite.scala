package org.apz.intro

import org.scalatest.FunSuite
import org.apz.intro.classes.Rational

class RationalSuite extends FunSuite {

  test("An empty Set should have size 0") {
    assert( Rational( -6, 9 ).toString == "-2/3" )
  }

  test("Un racional no es divisible por 0") {
    assertThrows[IllegalArgumentException] {
      val rational = Rational( -2, 0 )
    }
  }
  
  test("Test de igualdad 2/3==4/6") {
    assert( Rational(2, 3) == Rational(4, 6))
  }
  
  test("Operaciones de racionales") {
    val r5 = Rational( 1, 5)
    val r6 = Rational( 2, 7 )
  
    assert( r5 + r6 == Rational(17, 35))
    assert( r5 - r6 == Rational(-3, 35))
    assert( r6 - r5 == Rational(3, 35))
    assert( r5 * r6 == Rational(2, 35))
    assert( r5 / r6 == Rational(7, 10) )
    assert( r6 / r5 == Rational(10, 7) )
    assert( r5 + 5 == Rational(26, 5))
  }
  
}