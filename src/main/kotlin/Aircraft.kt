// task_17

class Aircraft {
    var id: Int = 0
    var maxRange: Double = 3000.0
    var tankCapacity: Double = 200.0
    val fuelConsumption: Double
        get() = tankCapacity / maxRange * 100
}