//package org.apz.intro

object M2B {
  
def main(args: Array[String]) {
     val mod2b = Map( ("1","iFruit"),("2","iFruit"),("3","iFruit"),
                   ("3A","iFruit"),("4","iFruit"),("4A","iFruit"),
                   ("5","iFruit"), ("S1","Ronin"), ("S2","Ronin"),
                   ("S3", "Ronin"), ("F01L","Sorrento"), ("F11L","Sorrento"),
                   ("F21L","Sorrento"), ("F23L","Sorrento"), ("F33LL","Sorrento"), 
                   ("F41L","Sorrento") )
                           
      if (args.length > 0) {
          println("Model name entered: " + args(0))

          if (mod2b.contains(args(0))) {
             println("Brand is: " + mod2b(args(0)) ) 
          } else { 
             println("Record not found")
          }
      } else {
          println("Models: ")
          mod2b.keys.foreach(println)
          println("Brands: " )
          mod2b.values.toSet.foreach(println)
      }
   }
}
