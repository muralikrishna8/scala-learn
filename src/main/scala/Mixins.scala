abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}

class StringIterator(s: String) extends AbsIterator {
  var index = 0
  type T = Char

  def hasNext: Boolean = index < s.length

  def next: T = {
    val ch = s charAt index
    index += 1
    ch
  }
}

trait RichIterator extends AbsIterator {
  def forEach(f: T => Unit): Unit = while(hasNext) f(next)
}

class RichStringIter(s: String) extends StringIterator(s) with RichIterator

object Mixins {
  def main(args: Array[String]): Unit = {
    val iter = new RichStringIter("Scala Rocks")
    iter.forEach(println)
  }
}
