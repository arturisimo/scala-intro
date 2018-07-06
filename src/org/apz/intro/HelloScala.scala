package org.apz.intro

object HelloScala {
  
  def main(args: Array[String]) {
      println("Hello, Scala!")
      
      //Cuando hacemos una llamada a una función con cero o un parámetro, 
      //ésta puede ser llamada sin utilizar el punto y los paréntesis. 
      
      val myList = List("Hello", "Scala", "!")
      
      myList.foreach(println)
      
      myList foreach println
      
      val hi = "Hello"
      
      println(hi length)
      println(hi.length())
      
  }
  
}
