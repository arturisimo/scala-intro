package org.apz.intro

import scala.io.Source

/*
Ejercicio Contar Palabras
Hay que leer un fichero y sacar por cada palabra el número de veces que aparece.
Hay que usar un Map mutable.
Hay que usar una función dentro del object que se llame contarPalabras.  Recibe como argumento un String con el nombre del fichero.  Devuelve el Map[String, Int].
Para leer el fichero, dentro de contarPalabras, tenéis que ver, usando la documentación de scala lo que devuelve Source.fromFile( ).  Una vez que sepáis el tipo ver el método getLines()
que está definido en el tipo.
El fichero lo tenéis que leer línea a línea.  Y luego por cada línea tenéis que extraer cada una de las palabras.  Es decir,
 for( x <- ??? )
  for( w <- ??? )
   incrementar el número de veces de w
   en el map
 devolver el map.
Desde el "main" hay que invocar a contarPalabras.
 */

object ContadorPalabrasMutableMap extends App {

    val map = contarPalabras("resources/palabras.txt")

    assert(2 == map("este"))

    def contarPalabras(fichero: String) = {

        val lines = Source.fromFile(fichero).getLines()

        var mutableMap: collection.mutable.Map[String, Int] = collection.mutable.Map()

        lines.foreach(_.split(" ").foreach(palabra=> {
            try {
                mutableMap  += palabra -> (mutableMap(palabra)+ 1)
            } catch {
                case e: Exception => println(s"$palabra >> iniciacion ")
                mutableMap  += (palabra -> 1)
            }
        }))
        mutableMap
    }

}
