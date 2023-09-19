// task_18

class Aircraft(val id: Int, val maxRange: Double, val tankCapacity: Double) {

    val fuelConsumption: Double
        get() = tankCapacity / maxRange * 100
}