import kotlin.random.Random

fun main() {
    val target = Random.nextInt(1, 51)
    println("Угадай число от 1 до 50")

    while (true) {
        print("Ваша догадка: ")
        val guess = readln().toInt()

        when {
            guess < target -> println("Больше!")
            guess > target -> println("Меньше!")
            else -> {
                println("Поздравляем! Вы угадали число $target")
                break
            }
        }
    }
}