package org.apz.intro.classes


/**
 * si declaramos la clase privada y definimos un object Rational -con el mismo nombre- 
 * hacemos que sea un objeto Singleton, hay una única instancia de la clase Racional
 * de esta manera los metodos de Rational son estaticos
 */
object Rational {
  def apply(n: Int, d: Int) = new Rational(n,d)
}

/**
 * Clase que representa a un numero racional:  n numerador - d denominador
 * n_ y d_ son atributos privados de la clase y solo existen en el ambito de la clase
 * n y d son los atributos publicos
 */
class Rational private (n_ : Int, d_ : Int) {
  
  //obtener el valor normalizado
  private def normalizar (n: Int, d:Int): (Int, Int) = {
    
    //algoritmo de euclides para obtener el max comun divisor
    def mcd(n: Int, d:Int) : Int = {
        var resto = n%d
        if (resto == 0) d.abs
        else mcd(d, resto)
    }
    
    if (d==0) throw new IllegalArgumentException(d.toString())
    else if(n==0) {
       (0,1) 
    } else {
      ( (n/mcd(n,d)).abs * (if (n * d > 0 ) 1 else -1) , (d/mcd(n,d)).abs)
    }
  }
  
  //sobrescribimos metodo toString
  override def toString : String = s"$n/$d"
  
  override def equals(r2: Any) : Boolean = {
    r2 match {
      case r2: Rational => n == r2.n && d == r2.d
      case _ =>  false
    }
  }
  
  override def hashCode() : Int = {
    n * d
  }
  
  //todo es constructor
  val (n,d) = normalizar(n_, d_)
  println(this.toString())
  
  
  
}