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
 */
object ModelToBrand {

   def main(args: Array[String]) {
     
     getBrand("S1");
     getBrand("F24L");
     getBrand("KK");
      
   }
   
   
   def getBrand(model: String ) {
     
     val loudacre = getClass.getResourceAsStream("loudacre.log")
         
     val mod2b = Source.fromInputStream(loudacre).getLines().map(line => (LogUtils.getDevModel(line).split(" ")(1), LogUtils.getDevModel(line).split(" ")(0)))
                                                            .toMap.withDefaultValue("Record not found")
     if (model.length > 0) {
          println("Model name entered: " + model)
          
          val brand = mod2b(model)
          println(brand)
     
      } else {
          println(s"Models: $mod2b.keys()"  )
          println(s"Brands: $mod2b.values()")
      }
     
     
   }
   
   
}

