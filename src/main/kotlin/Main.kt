fun main() {
    var a = 198577124
    var b = 12.0

    a++
    b--


    println("a = $a b = $b")

    println("a + b = ${a+b}")
    println("a - b = ${a-b}")
    println("a * b = ${a*b}")
    println("a / b = ${a/b}")
    println("a % b = ${a%b}")

    secondFun()
}

fun secondFun() {
    println("Hello KOTLIN")
}