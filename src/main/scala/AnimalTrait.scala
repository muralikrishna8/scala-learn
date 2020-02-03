import scala.collection.mutable.ArrayBuffer

trait Pet {
  val name: String
}

class Dog(val name: String) extends Pet
class Cat(val name: String) extends Pet

object Animals {
  def main(args: Array[String]): Unit = {
    val goofy = new Dog("Goofy")
    val mrCat = new Dog(name = "Mr. Cat")

    val animals = new ArrayBuffer[Pet].empty
    animals.append(goofy)
    animals.append(mrCat)

    animals.foreach(animal => println(animal.name))
  }
}
