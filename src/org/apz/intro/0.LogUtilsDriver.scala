package org.apz.intro

/**
 * Singleton Objects. Métodos y valores que no están asociados con instancias individuales de 
 * una clase se denominan objetos singleton y se denotan con la palabra reservada object en vez de class.
 *
 */
object LogUtilsDriver {
  
     def main(args: Array[String]) {
       
       import org.apz.intro.classes.LogUtils
       
       val record = "2014-03-15:10:10:31,Titanic 4000,1882b564-c7e0-4315-aa24-228c0155ee1b,58,36,39,31,15,0,TRUE,enabled,enabled,37.819722,-122.478611"
       val devId = LogUtils.getDevId(record)
       val devModel = LogUtils.getDevModel(record)
       
       println(s"Device ID: $devId")
       println(s"Device model: $devModel")
       
   }
     
}