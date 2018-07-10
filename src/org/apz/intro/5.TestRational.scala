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
  
    //test equals
    
    val r5 = Rational( 1, 5)
    val r6 = Rational( 2, 7 )
  
    assert( r5 + r6 == Rational(17, 35))
    assert( r5 - r6 == Rational(-3, 35))
    assert( r6 - r5 == Rational(3, 35))
    assert( r5 * r6 == Rational(2, 35))
    assert( r5 / r6 == Rational(7, 10) )
    assert( r6 / r5 == Rational(10, 7) )
    
    assert( r5 + r6 == Rational(1, 3))
  
    
    assert( r5 + 5 == Rational(6, 5))
    
    
    assert( 2 * r2 == Rational(4, 7 ))
    
    //unapply
    var Rational(n,d) = r * r2
    assert(n == 3 && d == 35 )
    
    r2 match {
      case Rational(2,v) => assert (v==7)
      case _ => assert(false)
    }
    
    
    //sort compare
    /*
    val l = List (Rational( -3, 5 ), Rational(6, 6), Rational(300, 500 ))
    assert (l.sorted() = List (Rational( -3, 5 ), Rational(6, 6 ), Rational(300, 500 )))*/
    
    
    
}