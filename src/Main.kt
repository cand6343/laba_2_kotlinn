
fun main() {
    print("Введите ваш уровень: ")
    val level = readln().toInt()

    val result = if (level < 10) {
        "Новичок! Вы получаете +10 HP."
    } else if (level < 50) {
        "Опытный! Вы получаете +30 HP."
    } else {
        "Легенда! Вы получаете +100 HP."
    }

    println(result)
}