abstract class Animal {
  def name: String
}

abstract class Pet extends Animal

class Cat extends Pet {
  override def name = "Cat"
}

class Dog extends Pet {
  override def name = "Dog"
}

class Lion extends Animal {
  override def name = "Lion"
}

class PetUpperBoundContainer[P <: Pet](animal: P) { // P should be subType of Pet <? extends Pet>
  def pet: P = animal
}

class PetLowerBoundContainer[P >: Pet](animal: P) { // P should be superType of Pet <? super Pet>
  def pet: P = animal
}

object GenericClass {
  def main(args: Array[String]): Unit = {

    new PetUpperBoundContainer[Pet](new Cat)
    new PetUpperBoundContainer[Cat](new Cat)
//    new PetUpperBoundContainer[Animal](new Lion) // will throw an error since it's lion extends Animal instead of pet

    new PetLowerBoundContainer[Animal](new Lion)
//    new PetLowerBoundContainer[Dog](new Dog) // will throw an error since it's Dog is not a superType of Animal
  }
}
