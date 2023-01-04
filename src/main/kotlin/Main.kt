fun main() {
    var a = 198577124
    var b = 12.0

    a++
    b--


    println("a = $a b = $b")

    // test comment
    /* this block is commented

     */
    println("a + b = ${a+b}")
    println("a - b = ${a-b}")
    println("a * b = ${a*b}")
    println("a / b = ${a/b}")
    println("a % b = ${a%b}")

    var c = 67

    secondFun()
}
/**
 * test to see if this shows in tooltip
 */
fun secondFun() {
    println("Hello KOTLIN")
}