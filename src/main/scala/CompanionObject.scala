class Email(val userName: String, val domainName: String)

object Email {
  def fromString(email: String): Option[Email] = {
    email.split("@") match {
      case Array(userName, domainName) => Some(new Email(userName, domainName))
      case _ => None
    }
  }
}

object Test {
  def printEmail(email: Option[Email]): Unit = {
    email match {
      case Some(email) => println(s""" Email
         | userName: ${email.userName},
         | Domain: ${email.domainName}
        """.stripMargin)
      case None => println("Invalid Email")
    }
  }

  def main(args: Array[String]): Unit = {
    printEmail(Email.fromString("Bla"))
    printEmail(Email.fromString("muralikv@thoughtworks.com"))
  }
}
