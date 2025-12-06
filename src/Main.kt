fun main() {
    val film = listOf("Интерстеллар", "Начало", "Матрица", "Побег из Шоушенка", "Криминальное чтиво")

    for (film in film) {
        println(film)
        println("Длина названия: ${film.length}")
    }
}