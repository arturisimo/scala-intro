## Introducción a Scala

* 0 Introducción - [HelloScala](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/0.HelloScala.scala)
* 0 Colecciones - [colecciones](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/0.Colecciones.scala)
* 0 Map mutable / inmutable - [ContadorPalabras](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/0.ContadorPalabras.scala)
* 1 Funciones - [ConvertList](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/1.ConvertList.scala) - [ProbandoIterators](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/1.ProbandoIterators.scala)
* 1 Array - [PositivosPrimero](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/1.PositivosPrimero.scala)
* 2 Sequence comprehensions - [EliminaNegativos](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/2.EliminaNegativos.scala)
* 3 Función Folding - [Folding](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/3.Folding.scala)
* 3 Groupby + breakOut [Brand2Models](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/3.Brand2Models.scala)
* 4 Option / match...case - [Convert2Float](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/4.Convert2Float.scala)
* 5 Singleton Objects - [LogUtilsDrivers](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/5.LogUtilsDriver.scala)
* 5 Classes - [Rational](https://github.com/arturisimo/scala-intro/blob/master/src/org/apz/intro/5.TestRational.scala)   

## Intro
Scala (**SCALable LAnguaje**) es un superset de Java, funciona en la JVM.
Scala es mas expresivo (menos línes de codigo) y tiene procesamiento implicito 
Es un lenguaje compilado scalac, compilador de Scala, genera el .class
Scala soporta programacion imperativa, POO y funcional 

La programacion funcional se adopta para la programación paralela y distribuida (multicores, GPUs, clusters) 
 
Scala se basa en: funciones puras y variables inmutables
El código de Scala se escribe en bloques, expresiones que siempre devuelven un valor

En scala no hay tipos primitivos, todo son objetos con metodos asociados. Todos los objetos heredan de la clase abstracta **Any** . **AnyVal** y **AnyRef** extiende de Any  El tipo **Unit** es el valor vacio 
Tipos en Scala - Byte / Short / Int / Long / Double / Float / Char / Boolean

Las funciones son "ciudadanos de primer orden" se consideran como una variable, se pueden pasar como parámetro
Se ha de procurar que sean funciones "puras" que no tienen "side effects" no cambia el valor de las variables fuera 
del ámbito de la funcion

Funciones son "ciudadanos de primera clase" esto es Scala las trata igual igual que un entero, o un string). 
Se pueden pasar como parametro function(function1)
  
Una funcion "pura" es una funcion determinada por los valores de entrada y siempre devuelve lo mismo (resultado deterministicos). No tiene efectos colaterales
Un efecto colateral modifica el estado de la variables

Funciones anonimas: **operador lambda**
	(parametro: tipo_parametro) => {codigo_de_la_funcion: tipo_retorno}

Funciones para colecciones
 * foreach
 * map aplica una función a cada elemento 
 * flatMap map que devuelve una coleccion del mismo tipo haciendo un join de todas las colecciones anidadas
 * filter filtrado segun una condicion
 * sortWitdh aplica una funcion de ordenacion
 * foldLeft. Folding  es parecido a una funcion reduce con un valor inicial
