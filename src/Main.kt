import kotlin.random.Random

fun main() {
    var balance = Random.nextInt(100, 1001)
    var day = 1

    println("Начальный баланс: $balance руб.")

    while (balance > 0) {
        val withdrawal = Random.nextInt(10, 101)

        if (balance >= withdrawal) {
            balance -= withdrawal
            println("День $day: Снято $withdrawal руб. Остаток: $balance руб.")
        } else {
            println("День $day: Снято $balance руб. Счёт пуст!")
            balance = 0
        }
        day++
    }
}