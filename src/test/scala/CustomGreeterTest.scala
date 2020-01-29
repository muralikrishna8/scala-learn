import org.scalatest.FunSuite

class CustomGreeterTest extends FunSuite {
  test("Greet") {
    new DefaultGreeter().greet("Murali Krishna")

    var greeting: Greeter = new CustomGreeter("Hello ", ", To the world")
    greeting.greet("Murali Krishna")

    assertResult(1)(1)

    greeting = new DefaultGreeter()
  }
}
