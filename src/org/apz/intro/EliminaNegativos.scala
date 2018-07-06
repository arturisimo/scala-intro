package org.apz.intro

/**
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
    
  /**
   * hay que obtener los indices con negativos
   * con esa coleccion (Si tiene más de un elemento) hay que atravesar la colección en orden inverso, borrando el elemento correspondiente, pero evitando la última posición; 
   * Es decir, Hay que convertir 2, 4, 5 en 5, 4 y una vez hecho esto borrar las posiciones 5 y 4 del ArrayBuffer. 
  */
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