class Point {
  private var _x = 0
  private var _y = 0

  def x = _x // getter
  def x_= (xValue: Int): Unit = { // setter
    _x = xValue
  }

  def y = _y
  def y_= (yValue: Int): Unit = {
    _y = yValue
  }
}

object Pointer {
  def main(args: Array[String]): Unit = {
    val point = new Point
    point.x = 100
    println(s"x = ${point.x}, y = ${point.y}")
  }
}
