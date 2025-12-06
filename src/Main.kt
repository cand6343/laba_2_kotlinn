import kotlin.random.Random

fun main() {
    val lower = "abcdefghijklmnopqrstuvwxyz"
    val upper = lower.uppercase()
    val digits = "0123456789"
    val symbols = "!@#$%^&*()_+-="
    val allChars = lower + upper + digits + symbols

    val length = Random.nextInt(8, 17)
    val password = CharArray(length)

    password[0] = upper[Random.nextInt(upper.length)]
    password[1] = lower[Random.nextInt(lower.length)]
    password[2] = digits[Random.nextInt(digits.length)]
    password[3] = symbols[Random.nextInt(symbols.length)]

    for (i in 4 until length) {
        password[i] = allChars[Random.nextInt(allChars.length)]
    }

    password.shuffle()
    println("Сгенерированный пароль: ${String(password)}")
}