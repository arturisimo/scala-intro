package org.apz.intro

import scala.language.implicitConversions


object StringImplicito extends App {
  
  val string : String = "HAL"
  
  
  implicit class incrementar( s: String ) {
  	//metodo sin argumentos. Emplea una funcion lambda => 
  	def increment() = s.map ( c => (c+1).toChar)
  }
  
println(string.increment())
  
}