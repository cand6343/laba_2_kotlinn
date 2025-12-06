import kotlin.random.Random

fun main() {
    println("10 бросков шестигранного кубика:")

    for (i in 1..10) {
        val dice = Random.nextInt(1, 7)
        println("Бросок $i: $dice")
    }
}