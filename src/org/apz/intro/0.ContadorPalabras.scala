package org.apz.intro

import scala.io.Source

/**
 * cuenta pablabras de un fichero
 */
object ContadorPalabras extends App {
  
  val t1 = System.currentTimeMillis()
  assert(2 == contarPalabrasMutable("resources/palabras.txt")("este"))
  println(System.currentTimeMillis()-t1 + "ms <<< test contar map mutable")
  
  val t2 = System.currentTimeMillis()
  val map = contarPalabrasInmutable("resources/palabras.txt")
  assert(2 == map("este"))
  println(System.currentTimeMillis()-t2 + "ms <<< test contar map inmutable")
  
  printOcurrencias(map)
  
  /**
   * cuenta utilizando map mutable 
   */
  def contarPalabrasMutable(fichero: String) = {

        val lines = Source.fromFile(fichero).getLines()
        var mutableMap: collection.mutable.Map[String, Int] = collection.mutable.Map()
        lines.foreach(_.split(" ").foreach(palabra=> {
            mutableMap(palabra) = mutableMap.getOrElse(palabra, 0) + 1
        }))
        mutableMap
  }
  
  //otra forma de hacerlo
  def contarPalabrasMutable2(fichero: String) = {

       val lines = Source.fromFile(fichero).getLines()
       
       var mutableMap: collection.mutable.Map[String, Int] = collection.mutable.Map()
       lines.foreach(_.split(" ").foreach(palabra=> {
           try {
               mutableMap  += palabra -> (mutableMap(palabra)+ 1)
           } catch {
               case e: Exception => println(s"$palabra >> iniciacion ")
               mutableMap  += (palabra -> 1)
           }
       }))
       mutableMap
  }
  
  /**
   * cuenta utilizando map inmutable
   */
  def contarPalabrasInmutable(fichero: String) = {

        val lines = Source.fromFile(fichero).getLines()

        var inmutableMap = Map[String, Int]()
        lines.foreach(_.split(" ").foreach(palabra=> {
            val contador = inmutableMap.getOrElse(palabra, 0) + 1
            //inmutableMap = inmutableMap.updated(palabra, contador)
            inmutableMap += palabra -> contador
        }))
        inmutableMap
  }
  
  //map foreach (println)
  def printOcurrencias(map: Map[String, Int]) {
    for((palabra, n )<- map) {
        val literal = if (n > 1) "veces" else "vez"
        println (s"$palabra sale $n $literal")
    }
  }
  
}