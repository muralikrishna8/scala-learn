trait Node[+B] {
  def prepend[U >: B](elem: U): Node[U]
}

case class ListNode[B](h: B, t: Node[B]) extends Node[B] {
  override def prepend[U >: B](elem: U): ListNode[U] = ListNode(elem, this)
  def head: B = h
  def tail: Node[B] = t
}

case class Nil[B]() extends Node[B] {
  override def prepend[U >: B](elem: U): ListNode[U] = ListNode(elem, this)
}

trait Bird
case class Goose() extends Bird
case class Parrot() extends Bird

object LinkedList {
  def main(args: Array[String]): Unit = {
    val initial = Nil[Goose]().prepend(Goose()) // To start with Goose and create the ability to add
                                                // Parrot we needed Node[+B] and prepend[U >: B]
    val second = initial.prepend(Parrot())

    println(initial.head)
    println(initial.tail)

    println(second.head)
    println(second.tail)
  }
}
