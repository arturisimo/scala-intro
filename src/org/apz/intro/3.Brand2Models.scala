package org.apz.intro

import scala.io.Source
import org.apz.intro.classes.LogUtils


/**
 * Groupby + breakOut para hacer un mapa de Sets
 *
 */
object Brand2Models extends App {

     val test = Set("Sorrento","iFruit","Ronin","KK","");
     
     test.foreach(brand => println(getModels(brand).mkString(", ")))
     
     longPais
     
    /**
     * 
     * @param model
     */
    def getModels(brand: String ) : Set[String] = {
         
         val loudacre = Source.fromFile("resources/loudacre.log").getLines()
     
         var mod2b : Map[String, Set[String]] = loudacre.map(line => (LogUtils.getDevModel(line).split(" ")(0), LogUtils.getDevModel(line).split(" ")(1)))
                                                       .toList //lista de tuplas marca-modelo
                                                       .groupBy(_._1) //map con clave marca y valor tuplas marca-modelo
                                                       .mapValues(_.map(_._2)(collection.breakOut): Set[String]) //map con clave marca y valor set de modelos
  
        mod2b.getOrElse(brand, Set(s"No hay modelos de $brand"))                                              
       
    }
     
     
     def longPais {
       
       val myMap: Map[Int, String] = List("India", "United States").map(c => (c.length, c))(collection.breakOut) // Map[Int,String] = Map(5 -> Japon, 6 -> Italia, 3 -> EUA)
       
       myMap.foreach(println)
       
       val list: List[(Int, String)] = List("India", "Japon", "USA").map(c => (c.length, c)) 
       val myMap2: Map[Int, Set[String]] = list.groupBy(_._1).mapValues(_.map(_._2)(collection.breakOut): Set[String]) //Map[Int,Set[String]] = Map(5 -> Set(India, Japon), 3 -> Set(USA))
       
       myMap2.foreach(println)
       
     }
   
   
}