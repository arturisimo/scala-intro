package org.apz.intro

import scala.io.Source
import org.apz.intro.classes.LogUtils


object Brand2Models extends App {

     val test = Set("Sorrento","iFruit","Ronin","KK","");
     
     test.foreach(brand => println(getModels(brand).mkString(", ")))
     
    /**
     * 
     * @param model
     */
    def getModels(brand: String ) : Set[String] = {
         
         val loudacre = Source.fromFile("resources/loudacre.log").getLines()
     
         var mod2b : Map[String, Set[String]] = loudacre.map(line => (LogUtils.getDevModel(line).split(" ")(0), LogUtils.getDevModel(line).split(" ")(1)))
                                                       .toList //lista de tuplas marca-modelo
                                                       .groupBy(_._1) //se agrupa por marca
                                                       .mapValues(_.map(_._2)(collection.breakOut): Set[String])
  
        mod2b.getOrElse(brand, Set(s"No hay modelos de $brand"))                                              
       
    }
   
   
}

