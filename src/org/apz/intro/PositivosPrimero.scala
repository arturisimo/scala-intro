package org.apz.intro

import collection.mutable.ArrayBuffer

/**
  * Dado un array de enteros devolver un array con los numero positivos primero
  *
 */
object PositivosPrimero extends App {

  var ns = Array(-5,0,90,70,90,-3000,6,21,-45)

  val t1 = System.currentTimeMillis()
  assert (ordenarAB(ns) sameElements Array(90,70,90,6,21,-5,0,-3000,-45))
  println(System.currentTimeMillis()-t1 + "ms <<< test ordenar ArrayBuffer")

 // ordenarA(ns) foreach (println)

  val t2 = System.currentTimeMillis()
  assert (ordenarA(ns) sameElements Array(90,70,90,6,21,-5,0,-3000,-45))
  println(System.currentTimeMillis()-t2 + "ms <<< test ordenar Array")

  val t3 = System.currentTimeMillis()
  assert (ordenarSW(ns) sameElements Array(90,70,90,6,21,-5,0,-3000,-45))
  println(System.currentTimeMillis()-t3 + "ms <<< test ordenar SortWidth")

  /**
    * primero los positivos utilizando ArrayBuffer coleccion mutable
    * @param numeros
    * @return
    */
  def ordenarAB(numeros: Array[Int]) = {
    var positivos = ArrayBuffer[Int]()
    var negativos = ArrayBuffer[Int]()
    for(n <- numeros) {
      if (n <= 0) negativos+=n else positivos+=n
    }
    positivos ++ negativos
  }

  /**
    * primero los positivos con Array
    * @param numeros
    * @return
    */
  def ordenarA(numeros: Array[Int]) = numeros.sortBy(x=> if(x > 0) -1 else +1)

  /**
    * primero los positivos con Array y SortWidth
    * en escala se pueden llamar a metodos dentro de un metodo
    * @param numeros
    * @return
    */
  def ordenarSW(numeros: Array[Int]) = {
    def ordenar(x:Int, y:Int) : Boolean = (x > 0 && y <= 0)
    numeros.sortWith(ordenar)
  }
  //otra forma de expresarlo
  def ordenarSW2(numeros: Array[Int]) = {
    numeros.sortWith(_>0 && _<=0)
  }

}
