package org.apz.intro.classes


/**
 * si declaramos la clase privada y definimos un object Rational -con el mismo nombre- 
 * hacemos que sea un objeto Singleton, hay una única instancia de la clase Racional
 * de esta manera los metodos de Rational son estaticos
 */
object Rational {
  
  def apply(n: Int, d: Int) = new Rational(n,d)
  
  def unapply(r: Rational): Option[(Int, Int)] = {
    if(r.d == 0) None
    else Some((r.n, r.d))
  }
  
  implicit class IntOps (n: Int) {
  
    def + (r: Rational ) = Rational( n, 1 ) + r
    def - (r: Rational ) = Rational( n, 1 ) - r
    def * (r: Rational ) = Rational( n, 1 ) * r
    def / (r: Rational ) = Rational( n, 1 ) / r
  
  }
  
}

/**
 * Clase que representa a un numero racional:  n numerador - d denominador
 * n_ y d_ son atributos privados de la clase y solo existen en el ambito de la clase
 * n y d son los atributos publicos
 * 
 * implementa el Trait Ordered para que se pueda ordenar por el metodo sort. Hay que añadir
 * el metodo compare
 */
class Rational private (n_ : Int, d_ : Int) extends Ordered[Rational] {
  
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
  
  override def compare(r2: Rational) : Int = {
     if(n * r2.d < d * r2.n) -1
      else if(n * r2.d == d * r2.n) 0
      else 1
  }
  
  override def hashCode() : Int = {
    n * d
  }
  
  //todo es constructor
  val (n,d) = normalizar(n_, d_)
  
  def + (r2:Rational) : Rational = Rational ((n * r2.d + r2.n * d), (d * r2.d)) 
  def - (r2:Rational) : Rational = Rational ((n * r2.d - d * r2.n), (d * r2.d))
  def * (r2:Rational) : Rational = Rational (n*r2.n, d * r2.d)
  def / (r2:Rational) : Rational = Rational (n*r2.d, d * r2.n)
  
  def + (i:Int) : Rational = this + Rational(i,1)
  def - (i:Int) : Rational = this - Rational(i,1)
  def * (i:Int) : Rational = this * Rational(i,1)
  def / (i:Int) : Rational = this / Rational(i,1)
  
  def incr(i:Int) : Rational = this * Rational(i,1)
  
  
}