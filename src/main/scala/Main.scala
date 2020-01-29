object Main extends App {
  def getAge(implicit config: Config): Age = {
    Age(config.age)
  }

  def getName(implicit config: Config): Name = {
    Name(config.name)
  }

  def getPerson(implicit config: Config): Person = {
    Person(getName, getAge)
  }

  println(getPerson(Config("Murali", 25)))
}

case class Age(age: Int)
case class Name(name: String)
case class Person(name: Name, age: Age)

case class Config(name: String, age: Int)

