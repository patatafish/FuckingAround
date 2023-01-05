import huge_package.Test

fun main() {
    val test = Test()
    println(test.name)
    println(test.age)

    test.name = "                   Farts"
    println(test.name)

    val biotch = Test("     mike hawk             ", 69)
    println(biotch.name)
    println(biotch.age)

    val fucks = Test(age = 100)
    println(fucks.age)

    val five = Test("            ", 34)
    println("${five.name} ${five.age}")
}

