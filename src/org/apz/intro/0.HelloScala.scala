package org.apz.intro

//_ importa todo de StringUtils
import org.apz.intro.classes.StringUtils._

/**
 * Scala (SCALable LAnguaje) es un superset de Java, funciona en la JVM.
 * Scala es mas expresivo (menos línes de codigo) y tiene procesamiento implicito 
 * Scala soporta programacion imperativa, POO y funcional 
 * 
 * Se basa en: funciones puras y datos inmutables
 *
 */
object HelloScala {
  
  def main(args: Array[String]) {
      
      println("Hello, Scala!")
      
      //Cuando hacemos una llamada a una función con cero o un parámetro, 
      //ésta puede ser llamada sin utilizar el punto y los paréntesis. 
      
      val myList = List("Hello", "Scala", "!")
      
      myList.foreach(println(_))
      
      myList foreach println
      
      val hi = "Hello"
      
      println(hi length)
      println(hi.length())
      
      
      //método sin parámetros
      def presentarse() {
        println("Hola, soy Arturo")
      }
      presentarse()
      
      //método con un parámetro de tipo String
      def presentarseA(nombre : String) {
        println("Hola, soy "+ nombre)
      }
      presentarseA("Arturo")
      
      //función que recibe un String y devuelve un String
      //no es necesario poner "return" devuelve el ultimo valor
      def presentarseFuncion(nombre : String) : String = {
        "Hola, Soy " + nombre
      }
      
      //se puede escribir asi tambien
      def presentarseFuncion2(nombre : String) : String = "Soy " + nombre
      
      //y no es necesario poner el tipo de retorno se infiere 
      def presentarseFuncion3(nombre : String) = "Soy " + nombre
      
      
      //uso de clase impliticta
      val string : String = "HAL"
      println(string.increment)
      
      
  }
  
}
