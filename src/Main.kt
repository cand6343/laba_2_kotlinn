fun main() {
    print("Введите число N: ")
    val n = readln().toInt()

    var sum = 0
    var i = 1
    while (i <= n) {
        sum += i
        i++
    }

    println("Сумма чисел от 1 до $n = $sum")
}