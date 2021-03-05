package org.apz.intro

/**
 * Sequence comprehensions. Comprehensions have the form for (enumerators) yield e
 * Collecting Data into a new Collection
 * yield returns a new collection of items rather than processing each item one at a time
 */
object EliminaNegativos extends App {
    
    //en escala esto se puede hacer
    import collection.mutable.ArrayBuffer
  
    var ns = ArrayBuffer(0,8,-7,4,-5,-6)
    
    val t1 = System.nanoTime()
    assert (eliminaNegativos(ns) sameElements ArrayBuffer(0,8,-7,4))
    println((System.nanoTime()-t1)/1000000 + "ms <<< test " + this.getClass)
  
    
    var ns2 = ArrayBuffer(0,8,-7,4,-5,-6)
    
    val t2 = System.nanoTime()
    assert (eliminaNegativos(ns2,2) sameElements ArrayBuffer(0,8,-7,4))
    println((System.nanoTime()-t2)/1000000 + "ms <<< test " + this.getClass)
    
   def eliminaNegativosExceptoPrimero(numeros: ArrayBuffer[Int]) = {
      
      val idx = for (n <- numeros; if(n < 0))
        yield numeros.indexOf(n) 
      
      for (ix <- idx.tail.reverse)
        numeros.remove(ix)
      
     numeros
   } 
  
   def eliminaNegativos(numeros: ArrayBuffer[Int], negativosPreservar: Int = 1) = {
      
      val idx = for (n <- numeros; if(n < 0))
        yield numeros.indexOf(n) 
      
        if (idx.length > negativosPreservar) {
          for (ix <- idx.drop(negativosPreservar).reverse)
            numeros.remove(ix)
        }
      numeros
   } 
    
    
  
}