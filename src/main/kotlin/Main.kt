fun main(args: Array<String>) {
    var employee1 = Employee("Jon", "Round", PositionTitle.ADMINISTRATION.summary, true, 50.00, 1 )
    var employee2 = Employee("Sara", "Conrad", PositionTitle.SALES.summary, false, 30.75, 2 )
    var employee3 = Employee("Mack", "Orville", PositionTitle.MAINTENANCE.summary, true, 20.50, 3 )


    println("------- Employees -------\n")

    employee1.printAll()
    employee1.payCalc(45.00)

    println()

    employee2.printAll()
    employee2.payCalc(50.00)

    println()

    employee3.printAll()
    employee3.payCalc(35.00)
}