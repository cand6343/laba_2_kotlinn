
fun main() {
    print("Введите ваш возраст: ")
    val age = readln().toInt()

    val result = if (age < 12) {
        "Вы ребёнок"
    } else if (age in 12..17) {
        "Вы подросток"
    } else {
        "Вы взрослый"
    }

    println(result)
}