package org.apz.intro.classes

/**
 * Uso de una clase implicita 
 */
object StringUtils {
  
  implicit class StringUtil( s: String ) {
    
  	//metodo sin argumentos. Emplea una funcion lambda => 
  	def increment() = s.map ( c => (c+1).toChar)
  	
  }
  
}