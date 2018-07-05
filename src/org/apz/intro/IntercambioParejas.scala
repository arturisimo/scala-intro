package org.apz.intro

/*
 * intercambia los elementos adyacentes de un array de enteros y devuelve unit
 * 
 * Notas: while no esta recomendado en Scala
 * Un metodo con un solo parametro se puede invocar sin poner el punto
 * 
 */
object IntercambioParejas extends App {
  
  var ns = Array(-5,0,90,70,91,-3000,6,21,-45,0)
  
  val t1 = System.currentTimeMillis()
  assert (swapAdjacent(ns) sameElements Array(0,-5,70,90,-3000,91,21,6,0,-45))
  println(System.currentTimeMillis()-t1 + "ms <<< test" + this.getClass)
  
  //numeros foreach(println)
  
  def swapAdjacent(numeros: Array[Int]) = {
    for (i <- 0 until numeros.length - 1 by 2) {
       val (a,b) = (numeros(i), numeros(i+1))
       numeros(i) = b
       numeros(i+1) = a
    }
    
    numeros 
  }
  
}