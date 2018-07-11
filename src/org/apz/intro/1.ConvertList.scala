package org.apz.intro


/**
 * Funciones son  "ciudadanos de primera clase" esto es Scala las trata igual igual que un entero, o un string). 
 * Se pueden pasar como parametro function(function1)
 * 
 * Una funcion pura es una funcion determinada por los valores de entrada y siempre devuelve lo mismo (resultado determinisitos). No tiene efectos colaterales
 * Un efecto colateral mofifica el estado de la variables
 * 
 * funciones anonimas: operador lambda
 * (parametro: tipo_parametro) => {codigo_de_la_funcion: tipo_retorno}
 * 
 * funciones para colecciones
 * – foreach
 * – map aplica una función a cada elemento 
 * - flatMap map que devuelve una coleccion del mismo tipo haciendo un join de todas las colecciones anidadas
 * – filter filtrado segun una condicion
 * - sortWitdh aplica una funcion de ordenacion
 * 
 */
object ConvertList extends App {
  
    val lista = List(3.6,5.9,3.4)
    
    convertList(lista, CtoF)
   
    def CtoF(celsius: Double) = (celsius * 9 / 5) + 32
    
    //otra forma de definir una funcion
    val doble = (celsius: Double) => 2 * celsius
    
    convertList(lista, doble)
    
    def convertList(myList:List[Double], convert:(Double) => Double) {
        for(n <- myList)
          println(n,convert(n))
    }      
    
    //foreach
    val phones : List[String] = List("MeToo", "Titanic", "Ronin")
    phones.foreach(println(_))
    
    //map
    lista.map(c => CtoF(c))
    lista.map(CtoF(_))
    lista.map(CtoF)
    lista.map(c => c * 9 / 5 + 32)
    lista.map(_ * 9 / 5 + 32)
    
    //filter
    lista.filter(_ < 23)
    
    //utiliza la funcion compare de la Clase
    lista.sorted
    
    //sortWidth funcion de ordenacion
    lista.sortWith(_ < _)
  
}
