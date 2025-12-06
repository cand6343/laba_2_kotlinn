fun main() {
    print("Введите строку: ")
    val input = readln().lowercase()
    val vowels = setOf('а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е', 'a', 'e', 'i', 'o', 'u')

    var count = 0
    for (char in input) {
        if (char in vowels) {
            count++
        }
    }

    println("Количество гласных: $count")
}