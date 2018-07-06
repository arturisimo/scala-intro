package org.apz.intro

import scala.language.implicitConversions
import org.apz.intro.classes.StringUtils._

/**
 * Folding : es parecido a una funcion reduce con un valor inicial
 */
object Folding extends App {
  
  val enteros = Array(82, 31, 72, 64,0,4587,789,-231)
  
  print (minmax(enteros))
  
  //metodo que devuelve una tupla (min, max) 
  def minmax(values:Array[Int]):(Int,Int) = {
  
    def calculate(tupla:(Int,Int), valor: Int) : (Int,Int) = {
      (tupla._1.min(valor), tupla._2.max(valor))
    }
    
    //values.foldLeft(Int.MaxValue,Int.MinValue) ( (t,v) => (t._1.min(v), t._2.max(v)) ) 
    values.foldLeft(Int.MaxValue,Int.MinValue) (calculate)
  }
  
  
  def sum(values:Array[Int]):(Int) = {
    values.foldLeft(0)((x,y) => x+y)
  }
  
  def mult(values:Array[Int]):(Int) = {
    values.foldLeft(0)((x,y) => x*y)
  }
    
}