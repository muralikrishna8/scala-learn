trait Node[B] {
  def prepend(elem: B): Node[B]
}

case class ListNode[B](h: B, t: Node[B]) extends Node[B] {
  override def prepend(elem: B): ListNode[B] = ListNode(elem, this)
  def head: B = h
  def tail: Node[B] = t
}

case class Nil[B]() extends Node[B] {
  override def prepend(elem: B): ListNode[B] = ListNode(elem, this)
}

trait Bird
case class Goose() extends Bird
case class Parrot() extends Bird

object LinkedList {
  def main(args: Array[String]): Unit = {
    val initial = Nil[Bird]().prepend(Goose())
    val second = initial.prepend(Parrot())

    println(initial.head)
    println(initial.tail)

    println(second.head)
    println(second.tail)
  }
}
