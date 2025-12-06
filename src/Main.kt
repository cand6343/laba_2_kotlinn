import kotlin.random.Random

fun main() {
    val days = listOf("Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс")
    val temps = mutableListOf<Int>()

    println("Температура на неделе:")

    for (day in days) {
        val temp = Random.nextInt(-10, 31)
        temps.add(temp)
        println("$day: $temp°C")
    }

    println("\nДни с отрицательной температурой:")
    for (i in days.indices) {
        if (temps[i] < 0) {
            println("${days[i]}: ${temps[i]}°C")
        }
    }
}