import scala.util.Random

trait Notification

case class EmailNotification(from: String, to: String, body: String) extends Notification

case class SmsNotification(caller: String, message: String) extends Notification

case class PushNotification(body: String) extends Notification


object PatternMatching {
  def main(args: Array[String]): Unit = {
    val r = Random.nextInt(10)

    println(
      r match {
        case 1 => "one"
        case 2 => "two"
        case _ => "Nothing"
      }
    )

    val emailNotification = EmailNotification("Murali", "Krishna", "Hello dude")
    val smsNotification = SmsNotification("Murali", "Call me back")
    val pushNotification = PushNotification("Murali has sent you a message")

    val list = Array(emailNotification, smsNotification, pushNotification)

    val index = Random.nextInt(3)

    val message = list(index) match {
      case EmailNotification(from, to, body) => s"From: ${from}, To: ${to}, body: ${body}"
      case SmsNotification(caller, message) => s"caller: ${caller}, message: ${message}"
      case _ => s"May be a push notification"
    }

    println(message)
  }
}
