import java.text.DecimalFormat

class Employee(
    name: String,
    lastName: String?,
    var position: String,
    var salary: Boolean,
    var payRate: Double,
    var shift: Int) {

    var fullName = ""
    var payFormat = DecimalFormat("\u0024###.00")

    var name = name
    var lastName = lastName



    init {
        fullName = "$name $lastName"


    }

    fun printAll(){
        println("Name: " + fullName + "\n" + "Position: " + position + "\n" + "Hourly Rate: " + payFormat.format(payRate) + "\n" + "Shift: " + shift)
    }

    fun payCalc(hoursIn:Double) {

        var formatted = DecimalFormat("\u0024###,###.00")

        var total = hoursIn * payRate

        when (shift){

            2 -> {
                total *= 1.05

                if (hoursIn > 40){
                    total *= 1.5
                } else {
                    total = total
                }

            }

            3 -> {
                total *= 1.10

                if (hoursIn > 40){
                    total *= 1.5
                } else {
                    total = total
                }

            }

            else -> {
                total

                if (hoursIn > 40){
                    total *= 1.5
                }
            }

        }
        return println( "Earned: ${formatted.format(total)} last week.")

    }

}