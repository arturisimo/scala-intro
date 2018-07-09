package org.apz.intro

import scala.language.implicitConversions
import org.apz.intro.classes.StringUtils._


object ProbandoIterarors extends App {
  
  
  val phoneBattery = List(82.3, 31.6, 72.5, 64.7)
  
  for (i <- 0 until phoneBattery.length)
    println(phoneBattery(i) + "% = " + mAh(phoneBattery(i))+ " mAh")
  
  //list comprenhension
  val myList = for (percent <- phoneBattery) 
    yield mAh(percent)  
  
  val myList1 = for (percent <- phoneBattery) 
    yield { 
      println(percent + "mAh"); 
      mAh(percent)
  }
  
  val myList2 = phoneBattery.map(pb => mAh(pb))
  
  val myList3 = phoneBattery.map(mAh(_))
  
  val myList4 = phoneBattery.map(mAh)
  
  //>funcion anonima
  val myList5 = phoneBattery.map(percent => percent/ 100 * 5400)
  
  //funcion anonima
  val myList6 = phoneBattery.map(_/ 100 * 5400)
  
  myList foreach println
  myList2 foreach println
  myList3 foreach println
  myList4 foreach println
  myList5 foreach println
  
  
  def mAh(percent: Double) = (percent/100) * 5400
  
  
}