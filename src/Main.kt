fun main() {
    print("Введите один символ: ")
    val ch = readln().first()

    val type = when (ch) {
        in '0'..'9' -> "Цифра"
        in 'a'..'z', in 'A'..'Z' -> "Буква латинского алфавита"
        ' ' -> "Пробел"
        else -> "Спецсимвол"
    }

    println("Это $type.")
}