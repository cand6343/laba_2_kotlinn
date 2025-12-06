fun main() {
    print("Введите число от 1 до 50: ")
    val number = readln().toInt()

    if (number in 10..50) {
        println("Число $number входит в диапазон от 10 до 50.")
    } else {
        println("Число $number не входит в диапазон от 10 до 50.")
    }
}