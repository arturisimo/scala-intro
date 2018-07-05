package org.apz.intro.classes

implicit class StringIncrementado( s: String ) {
	//metodo sin argumentos. Emplea una funcion lambda => 
	def increment() = s.map ( c => (c+1).toChar)
}