package example

/**
 * Una clase en Scala puede también importar código de uno o varios traits.
 * Los traits son como interfaces que también pueden contener código. 
 * Cuando una clase hereda de un trait, implementa la interface de ese trait, y hereda todo el código contenido en el trait.
 */
object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
