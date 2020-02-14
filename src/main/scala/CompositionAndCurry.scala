object CompositionAndCurry {
  def add(x: Int, y: Int) = x + y
  def multiply(x: Int, y: Int) = x * y

  def add10 = x => add(10, x)
  def multiply10 = (x: Int) => multiply(10, x)

  val add20: Int => Int = add(20, _)
  val multiply20 = multiply(20, _)

  def add1(x: Int)(y: Int) = x + y
  val add11 = add1(10) _

  def main(args: Array[String]): Unit = {
    println({
      (add10 andThen multiply10)(10)
    })

    println({
      (add20 compose multiply20)(20)
    })

    println({
      (add11 compose multiply20)(20)
    })
  }
}
