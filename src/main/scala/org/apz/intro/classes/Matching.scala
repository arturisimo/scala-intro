package org.apz.intro.classes

case class SimpleParsed(id: Long, text: String)

object Matching {
  
    def printNum(int: Int) = int match {
        case 0 => println("zero") 
        case 1 => println("one")
        case _ => println("otro valor")
    }
    
    val tweetRegex = "\"id\":(.*),\"text\":\"(.*)\"".r
    
    def parseTweet(str: String) = {
        tweetRegex.findFirstMatchIn(str) match {
          case Some(m) => {
            val id = str.substring(m.start(1), m.end(1)).toInt
            val text = str.substring(m.start(2), m.end(2))
            Some(SimpleParsed(id, text))
          }
          case _ => None
        }
    }
    
}
