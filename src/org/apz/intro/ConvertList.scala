package org.apz.intro


/**
 * Pasando una funcion como parametro
 * 
 */
object ConvertList extends App{
  
  
    val lista = List(3.6,5.9,3.4)
    
    convertList(lista, CtoF)
   
    //otra forma de definir una funcion
    val doble = (celsius: Double) => 2 * celsius
    
    convertList(lista, doble)
    
    
    def convertList(myList:List[Double], convert:(Double) => Double) {
        for(n <- myList)
          println(n,convert(n))
    }      
    
    
    def CtoF(celsius: Double) = (celsius * 9 / 5) + 32
    
    
    
    
    
  
}
