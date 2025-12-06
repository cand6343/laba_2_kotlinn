import kotlin.random.Random

fun main() {
    print("Введите ваше имя: ")
    val name = readln()

    println("Ответьте на 3 вопроса:")

    print("1. Ваш любимый цвет: ")
    val color = readln()

    print("2. Ваше любимое животное: ")
    val animal = readln()

    print("3. Ваше любимое время года: ")
    val season = readln()

    val feedback = listOf(
        "Ты крутой!",
        "Хорошая работа!",
        "Отличные ответы!",
        "Интересный выбор!",
        "Молодец!"
    )

    println("\n=== РЕЗУЛЬТАТЫ ===")
    println("Имя: $name")
    println("Ответы: $color, $animal, $season")
    println("Отзыв: ${feedback[Random.nextInt(feedback.size)]}")
}