package org.apz.intro

//_ importa todo de StringUtils
import org.apz.intro.classes.StringUtils._

/**
 * Scala (SCALable LAnguaje) es un superset de Java, funciona en la JVM.
 * Scala es mas expresivo (menos línes de codigo) y tiene procesamiento implicito 
 * Es un lenguaje compilado scalac, compilador de Scala, genera el .class
 * Scala soporta programacion imperativa, POO y funcional 
 * 
 * La programacion funcional se adopta paa programación paralela y distribuida (multicores, GPUs, clusters) 
 *  
 * Scala se basa en: funciones puras y variables inmutables
 * El código de Scala se escribe en bloques, expresiones que siempre devuelven un valor
 * Las funciones son "ciudadanos de primer orden" se consideran como una variable, se pueden pasar como parámetro
 * Se ha de procurar que sean funciones "puras" que no tienen "side effects" no cambia el valor de las variables fuera 
 * del ámbito de la funcion
 *
 * 
 * Tipos en Scala - Byte / Short / Int /Long / Double / Float / Char / String / Boolean
 * Tipos especiales 
 * - Unit vacio / - Any todos extienden de Any  
 * 
 */
object HelloScala {
  
  def main(args: Array[String]) {
      
      //val (value) – immutable
      val string : String = "Scala"
    
      println(s"Hello, $string!")// uso de parametros en String 
      
      //Cuando hacemos una llamada a una función con cero o un parámetro, 
      //ésta puede ser llamada sin utilizar el punto y los paréntesis. 
      
      val myList = List("Hello", "Scala", "!")
      
      myList.foreach(println(_))
      
      myList foreach println
      
      //var (variable) mutable
      var hi = "Hello" //no decimos que es un String. Scala hace inferencia de tipos
      
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
      val hal : String = "HAL"
      println(hal.increment)
      
      //Any: todos los elementos de esta coleccion extienden de Any
      val randomlist = List("iFruit", 3, "Ronin", 5.2)//List[Any] = List(iFruit, 3, Ronin, 5.2)
      
      
  }
  
}