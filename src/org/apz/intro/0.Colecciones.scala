package org.apz.intro


/**
 * Las colecciones implementan el trait Transversable
 * 
 * Tuple: tamaño fijo. No esta en la libreria de colecciones
 * List: tamaño flexible. es inmutable esto es: los elementos no se pueden modificar
 * ListBuffer: lista mutable se pueden cambiar los elementos por asignacin
 * Array: lista fija y mutable no permite añadir elementos pero si modificarlos El acceso a elementos es rapido
 * Map: coleccion clave-valor
 *
 */
object Colecciones extends App {
  
  //tupla
  val myTup2 = Tuple2(4, "iFruit")

  println(myTup2.getClass)  //Class[_ <: (Int, String)] = class scala.Tuple2
  
  println(myTup2._2)

  myTup2.swap


  //lista
  val miLista = List("MeToo", "Ronin", "iFruit")
  
  //lista con cons operator "::"
  val newList = "a" :: "b" :: "c" :: Nil
  
  //añadiendo elementos con cons
  val miLista2 = "KK"::miLista
  val miLista3 = miLista2 :: "KK" :: Nil
  
  //iterator
  var it = miLista.iterator
  
  //para acceder a un elemento se utiliza el metodo apply -de forma implicita
  println(newList(1)) //String = Sorrento
  println(newList.apply(1)) //String = Sorrento
  
  //secuencias
  val mySeq = Seq("MeToo", "Ronin", "iFruit")
  println(mySeq(1))
  
  //set 
  val mySet = Set("MeToo", "Ronin", "iFruit", "Ronin")
  //elimina los duplicasos removes duplicates
  println(mySet) //Set(MeToo, Ronin, iFruit)
  println (mySet("Banana"))
  
  val myset2 = mySet.drop(1)
 
  //listBuffer lista mutable
  val listBuffer = scala.collection.mutable.ListBuffer.empty[Int]
  listBuffer += 17
  listBuffer += 29
  listBuffer += 45
  
  println(listBuffer)//ListBuffer(1, 2, 3)
  
  //Array
  val devices: Array[String] = new Array[String](4)
  devices.update(0,"KK")
  devices(1) = "KK1" //Array[String] = Array(KK, KK1, null, null)
  
  //map coleccion clave-valor
  val myMap: Map[Int,String] = Map(1 -> "a", 2 -> "b")
  
  println(myMap.getOrElse(2, "No existe"))
  println(myMap.getOrElse(3, "No existe"))
  
  //map mutable
  val mutMap = scala.collection.mutable.Map(("Brand" -> "Titanic"), ("Model" -> "4000"), ("Wireless" -> "enabled"))
  
  //permite utilizar el metodo update (que se llama de forma implicita
  mutMap("Wireless") = "disabled"
  println(mutMap)//Map(Wireless -> disabled, Model -> 4000, Brand -> Titanic)
  

}