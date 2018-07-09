package org.apz.intro


/**
 * Funciones son  "ciudadanos de primera clase" esto es Scala las trata igual igual que un entero, o un string). 
 * Se pueden pasar como parametro function(function1)
 * 
 * Una funcion pura es una funcion determinada por los valores de entrada y siempre devuelve lo mismo (resultado determinisitos). No tiene efectos colaterales
 * Un efecto colateral mofifica el estado de la variables
 * 
 */
object ConvertList extends App {
  
  
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
