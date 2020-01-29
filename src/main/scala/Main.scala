object Main extends App {
  def getAge(config: Config): Age = {
    Age(config.age)
  }

  def getName(config: Config): Name = {
    Name(config.name)
  }

  def getPerson(config: Config): Person = {
    val name = getName(config)
    val age = getAge(config)
    Person(name, age)
  }

  println(getPerson(Config("Murali", 25)))
}

case class Age(age: Int)
case class Name(name: String)
case class Person(name: Name, age: Age)

case class Config(name: String, age: Int)

