case class RegularPerson(name: String, reportsTo: RegularPerson) {

}

object RegularPerson {
  def getSupervisorName(employee: RegularPerson): String = {
    if (employee != null) {
      val supervisor = employee.reportsTo

      if (supervisor != null) {
        val superSupervisor = supervisor.reportsTo

        if(superSupervisor != null) {
          return superSupervisor.name
        }
      }
    }

    null
  }
}
