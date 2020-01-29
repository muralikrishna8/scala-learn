trait Greeter {
  def greet(name: String): Unit = {
    println("Hello " + name)
  }
}

class DefaultGreeter extends Greeter

class CustomGreeter(prefix: String, suffix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + suffix)
  }
}
