package org.apz.intro

object TestRational extends App {
  
  import org.apz.intro.classes.Rational
  
    //si no fuera privado el constructor se podria llamar asi
    //val r = new Rational( 3, -5 )
    val r = Rational( 3, -5 )
    assert( r.toString == "-3/5" )
   
    val r2 = Rational( -3, -5 )
    assert( r2.toString == "3/5" )
   
    val r3 = Rational( -6, 9 )
    assert( r3.toString == "-2/3" )
   
    try {
      val r4 = Rational( -2, 0 )
      assert( false )
    }
    catch {
      case e: IllegalArgumentException => assert( true )
      case _: Throwable => assert( false )
    }
    
    //test equals
    assert( Rational(2, 3) == Rational(4, 6))
  
  
}