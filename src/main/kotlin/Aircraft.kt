// task_18

open class Aircraft(val id: Int, val maxRange: Double, val tankCapacity: Double) {

    val fuelConsumption: Double
        get() = tankCapacity / maxRange * 100
}

// task_19
class Boeing747(id: Int, maxRange: Double, tankCapacity: Double, val passengersNumber: Int) :
    Aircraft(id, maxRange, tankCapacity)