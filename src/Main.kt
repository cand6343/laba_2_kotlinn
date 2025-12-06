import kotlin.random.Random

fun main() {
    val num1 = Random.nextInt(0, 6)
    val num2 = Random.nextInt(0, 6)
    val num3 = Random.nextInt(0, 6)

    println("Слот-машина: [$num1] [$num2] [$num3]")

    if (num1 == num2 && num2 == num3) {
        println("Джекпот! 🎰")
    } else {
        println("Попробуйте ещё раз")
    }
}