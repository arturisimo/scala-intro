package org.apz.intro

import scala.io.Source
import org.apz.intro.classes.LogUtils

/**
 * Loudacre support has received a report containing the model name of the phone in
 * error, but the brand name has been omitted. They requested a command line tool to
 * enable reverse lookup of the brand name based on the model name.
 * In this section you will create a command line tool that will use a Map to look up
 * phone model numbers and return their corresponding manufacturer brand names.
 * 
 * Expand the program to define a Map that captures all of the following relationships:
 * iFruit brand: Models 1, 2, 3, 3A, 4, 4A, 5
 * Ronin brand: Models S1, S2, S3
 * Sorrento brand: Models F01L, F11L, F21L, F23L, F33LL, F41L
 * 
 * If the model is not recognized, print out “Record not found.”
 * If the program is called with no input arguments (that is, if the length of the
 * args array is 0), then print out a list of keys (models) and a list of values
 * (brands).
 * Hint: Generate a list of the Map’s values (brands) and convert it to a 
 * Set. Because the Set collection ensures unique values, it will 
 * automatically remove the duplicate brands.
 * 
 * Field Sample Data
    Date and time 2014-03-15:10:10:31
    Model name and number Titanic 4000
    Unique device ID 1882b564-c7e0-4315-aa24-228c0155ee1b
    Device temperature (Celsius) 58
    Ambient temperature
    (Celsius)
    36
    Battery available (percent) 39
    Signal strength (percent) 31
    CPU utilization (percent) 15
    RAM memory usage (percent) 0
    GPS Status
    (enabled=TRUE,
    disabled=FALSE)
    TRUE
    Bluetooth status
    (enabled/disabled/connected)
    enabled
    WiFi status
    (enabled/disabled/connected)
    enabled
    Latitude 37.819722
    Longitude -122.478611
 * 
 */
object ModelToBrand extends App {

     getModel("Sorrento");
     getModel("iFruit");
     getModel("Ronin");
     getModel("KK");
     getModel("");
      
   
    /**
      * 
     * @param model
     */
    def getModel(brand: String ) {
         
         val loudacre = getClass.getResourceAsStream("loudacre.log")
             
         val mod2b = Source.fromInputStream(loudacre).getLines().map(line => (LogUtils.getDevModel(line).split(" ")(0), LogUtils.getDevModel(line).split(" ")(1)))
                                                                //.toSet.groupBy((Tuple)x => x._1)
                                                                .toMap.withDefaultValue("Record not found")
         
        for (s <- mod2b) println(s)
           
          /*
          if (brand.length > 0) {
              val model = mod2b(brand)
              println(s"brand: $brand, model: $model")
                   
          } else {
              println("Models: " + mod2b.keys.mkString(","))
              println("Brands: " + mod2b.values.mkString(","))
          }
         */
                                                                
                                                                
         
    }
   
   
}

