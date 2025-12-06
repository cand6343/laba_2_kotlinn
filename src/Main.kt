import kotlin.math.PI

// Задание 1. Класс Weapon
class Weapon {
    var name = "Оружие"
    var damage = 10
    var durability = 100
    var type = "Обычное"

    fun showInfo() {
        println("Название: $name | Урон: $damage | Прочность: $durability | Тип: $type")
    }

    fun use() {
        if (durability <= 0) {
            println("Оружие сломано!")
            return
        }
        durability -= 10
        if (durability <= 0) {
            durability = 0
            println("Оружие сломано!")
        } else {
            println("Оружие использовано. Прочность: $durability")
        }
    }

    fun upgrade(bonus: Int) {
        damage += bonus
        println("Урон увеличен на $bonus. Теперь урон: $damage")
    }
}

// Задание 2. Класс Student
class Student(var name: String, var age: Int) {
    init {
        println("Создан студент")
    }

    fun introduce() {
        println("Меня зовут $name, мне $age лет")
    }

    fun haveBirthday() {
        age++
        println("$name празднует день рождения! Теперь ему/ей $age лет")
    }
}

// Задание 3. Класс Group
class Group(val groupName: String) {
    private val students = mutableListOf<Student>()

    init {
        println("Создана группа")
    }

    fun addStudent(student: Student) {
        students.add(student)
        println("Студент ${student.name} добавлен в группу $groupName")
    }

    fun listStudents() {
        println("Студенты группы $groupName:")
        for (student in students) {
            student.introduce()
        }
    }

    fun celebrateBirthdays() {
        println("В группе $groupName празднуют дни рождения!")
        for (student in students) {
            student.haveBirthday()
        }
    }
}

// Задание 4. Класс GeometryCalculator
class GeometryCalculator {
    fun rectangleInfo(width: Int, height: Int) {
        val perimeter = 2 * (width + height)
        val area = width * height
        println("Прямоугольник $width x $height:")
        println("Периметр: $perimeter")
        println("Площадь: $area")
        if (perimeter == area) {
            println("Удивительно! Периметр равен площади!")
        }
    }

    fun triangleInfo(a: Int, b: Int, c: Int) {
        val perimeter = a + b + c
        val isRight = (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a)
        println("Треугольник со сторонами: $a, $b, $c")
        if (isRight) {
            println("Это прямоугольный треугольник!")
        } else {
            println("Это не прямоугольный треугольник")
        }
        println("Периметр: $perimeter")
    }

    fun circleInfo(radius: Double) {
        val circumference = 2 * PI * radius
        val area = PI * radius * radius
        println("Окружность с радиусом $radius:")
        println("Длина окружности: $circumference")
        println("Площадь круга: $area")
    }
}

fun main() {
    println("Оружие")
    val weapon = Weapon()
    weapon.showInfo()
    weapon.upgrade(5)
    weapon.use()

    println("\nСтудент")
    val student = Student("Данила", 20)
    student.introduce()
    student.haveBirthday()

    println("\nГруппа")
    val group = Group("ИСП-233")
    group.addStudent(student)
    group.addStudent(Student("Денис", 20))
    group.listStudents()
    group.celebrateBirthdays()

    println("\nГеометрия")
    val calc = GeometryCalculator()
    calc.rectangleInfo(4, 5)
    calc.triangleInfo(3, 4, 5)
    calc.circleInfo(5.0)
}