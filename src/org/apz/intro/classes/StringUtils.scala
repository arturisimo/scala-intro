package org.apz.intro.classes

object StringUtils {
  
  implicit class StringUtil( s: String ) {
    
  	//metodo sin argumentos. Emplea una funcion lambda => 
  	def increment() = s.map ( c => (c+1).toChar)
  	
  }
  
 
  
}