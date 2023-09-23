// task_21

abstract class Aircraft(val id: Int, val maxRange: Double, val tankCapacity: Double) {

    val fuelConsumption: Double
        get() = tankCapacity / maxRange * 100
}

// task_20
class Boeing747(id: Int, maxRange: Double, tankCapacity: Double, override val passengersNumber: Int) :
    Aircraft(id, maxRange, tankCapacity), Passenger

interface Passenger {
    val passengersNumber: Int
}