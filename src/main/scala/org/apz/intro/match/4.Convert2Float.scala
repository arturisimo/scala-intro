package org.apz.intro

/**
 * Option es un tipo especial que cotiene un Some o None, por lo que se utiliza para funciones
 * que pueden lanzar excepciones por ser None (null) 
 *
 */
object Convert2Float extends App {
  
  
  convert2Float(None);
  convert2Float(Option(0L));
  
  
   /**
    * uso de match..case
    *  @param x
    * @return
    */
  def convert2Float(x: Option[Any]) = x match {
      case Some(d: Double) => d.toFloat
      case Some(i: Int) => i.toFloat
      case Some(f: Float) => f
      case Some(_: Any) => println("Invalid data provided.")
      case None => println("No data provided.")
    }
  
  
  val mixedArr = Array("11", 12, "thirteen", 14.0, 'F', null, None)
  
  for (elem <- mixedArr) {
    test(elem)
  }
  
  def test(elem:Any) = elem match {
      case elem:String => println("String: " + elem)
      case elem:Int => println("Integer: " + elem)
      case elem:Double => println("Float: " + elem)
      case elem:AnyRef => println("Unknown: " + elem)
      case elem:Char => println("Char: " + elem)
      case null => println("Found null")
  }


  
}