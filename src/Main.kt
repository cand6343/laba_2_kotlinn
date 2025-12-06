// ЗАДАНИЕ 1
fun showGameLogo() {
    println("=== EPIC QUEST ===")
}

// ЗАДАНИЕ 2
fun showEnemy(name: String, level: Int) {
    println("Враг: $name (Уровень: $level)")
}

// ЗАДАНИЕ 3
fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""})")
}

// ЗАДАНИЕ 5
fun calculateXP(level: Int): Int {
    return level * 1000
}

// ЗАДАНИЕ 6
val inventory = listOf("Меч", "Щит", "Лук")

fun checkInventory(item: String): Boolean {
    return item in inventory
}

// ЗАДАНИЕ 7
fun castSpell() {
    println("Каст случайного заклинания!")
}

fun castSpell(spell: String) {
    println("Каст заклинания $spell!")
}

fun castSpell(spell: String, power: Int) {
    println("Каст $spell с силой $power!")
}

// ЗАДАНИЕ 8
fun createWeapon(name: String): String {
    return "Оружие: $name"
}

fun createWeapon(name: String, damage: Int): String {
    return "Оружие: $name (Урон: $damage)"
}

fun createWeapon(damage: Int, isMagic: Boolean): String {
    val type = if (isMagic) "Магическое" else "Обычное"
    return "$type оружие (Урон: $damage)"
}

// ЗАДАНИЕ 9
fun heal() {
    println("Лечение: +10 HP")
}

fun heal(amount: Int) {
    println("Лечение: +$amount HP")
}

fun heal(amount: Int, isPotion: Boolean) {
    if (isPotion) {
        println("Выпито зелье (+$amount HP)")
    } else {
        println("Заклинание лечения (+$amount HP)")
    }
}

// MAIN
fun main() {
    // Задание 1
    showGameLogo()
    showGameLogo()

    println()

    // Задание 2
    showEnemy("Гоблин", 5)
    showEnemy("Орк", 10)

    println()

    // Задание 3
    spawnEnemy("Скелет")
    spawnEnemy("Дракон", isBoss = true)

    println()

    // Задание 4
    spawnEnemy("Зомби", 300)
    spawnEnemy("Король Тьмы", 500, true)

    println()

    // Задание 5
    val xpForLevel5 = calculateXP(5)
    println("Опыт для 5 уровня: $xpForLevel5")

    println()

    // Задание 6
    println("Есть ли 'Меч' в инвентаре? ${checkInventory("Меч")}")
    println("Есть ли 'Зелье' в инвентаре? ${checkInventory("Зелье")}")

    println()

    // Задание 7
    castSpell()
    castSpell("Огненный шар")
    castSpell("Ледяная стрела", 25)

    println()

    // Задание 8
    println(createWeapon("Меч"))
    println(createWeapon("Лук", 15))
    println(createWeapon(30, true))

    println()

    // Задание 9
    heal()
    heal(50)
    heal(100, true)
    heal(75, false)
}