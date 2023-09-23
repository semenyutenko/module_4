// task_22

abstract class Aircraft(protected val id: Int, protected val maxRange: Double, protected val tankCapacity: Double) {

    protected val fuelConsumption: Double
        get() = tankCapacity / maxRange * 100

    open fun showParams() {
        println("""
            id: $id
            max range: $maxRange
            tank capacity: $tankCapacity
            fuel consumption: $fuelConsumption
        """.trimIndent()
        )
    }
}

class Boeing747(id: Int, maxRange: Double, tankCapacity: Double, override val passengersNumber: Int) :
    Aircraft(id, maxRange, tankCapacity), Passenger {
    override fun showParams() {
        super.showParams()
        println("passengers number: $passengersNumber")
    }
}

interface Passenger {
    val passengersNumber: Int
}