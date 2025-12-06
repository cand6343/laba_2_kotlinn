fun main() {
    val number = 5
    repeat(10) { i ->
        println("$number × ${i + 1} = ${number * (i + 1)}")
    }
}