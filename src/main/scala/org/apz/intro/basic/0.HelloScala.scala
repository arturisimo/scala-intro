package org.apz.intro

import org.apz.intro.classes.StringUtils._

object HelloScala extends App {
      
      /**
       * val – immutable
       */
      def hola() {
        val string : String = "Scala"
      
        // uso de parametros en String 
        println(s"Hello, $string!")
      }
      
      hola
      
      /**
       * var (variable) mutable
       * no decimos que es un String. Scala hace inferencia de tipos
       */
      def hello() {
        var hi = "Hello"
      
        println(hi length)
        println(hi.length())
      }
      
      hello()
      
      
      /**
       * método con un parámetro de tipo String
       */
      def presentarseA(nombre : String) {
        println("Hola, soy "+ nombre)
      }
      presentarseA("Arturo")
      
      /**
       * función que recibe un String y devuelve un String
       * no es necesario poner "return" devuelve el ultimo valor
       */
      def presentarseFuncion(nombre : String) : String = {
        "Hola, Soy " + nombre
      }
      
      //se puede escribir asi tambien
      def presentarseFuncion2(nombre : String) : String = "Soy " + nombre
      
      //y no es necesario poner el tipo de retorno se infiere 
      def presentarseFuncion3(nombre : String) = "Soy " + nombre
      
      println(presentarseFuncion("A"))
      println(presentarseFuncion2("B"))
      println(presentarseFuncion3("C"))
      
      /**
       * uso de clase impliticta 
       */
      def usoImplicito() {
        val hal : String = "HAL"
        println(hal.increment)
      }
      
      /**
       * Any: todos los elementos de esta coleccion extienden de Any
       */
      def listaAny() {
          val randomlist = List("iFruit", 3, "Ronin", 5.2)//List[Any] = List(iFruit, 3, Ronin, 5.2)
      }
      
      /**
       * Cuando hacemos una llamada a una función con cero o un parámetro,
       * ésta puede ser llamada sin utilizar el punto y los paréntesis. 
       */
      def recorrerBucle() {
        val myList = List("Hello", "Scala", "!")
        myList.foreach(println(_))
        myList foreach println
      }
      recorrerBucle
}