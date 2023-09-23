// task_23

fun main() {
    val volvo = Car("Volvo", "red", "2345VOG")
    val bmw = Car("BMW", "white", "007DDD")
    println(volvo.toString())
    println(bmw.toString())
}

data class Car(val brand: String, val color: String, val number: String)
