fun main() {
    var i = 0
    while (i <= 50){
        println(i)
        i++
    }


    fuckass@ do {
        var j = 15
        while (j > 10) {
            println("---${--j}")
            if (j == 11) break@fuckass
        }
        i--
        println(i)
    } while (i != 3)

    byTwo(38385)

}

fun byTwo(myInput: Int) {
    var input = myInput
    print("$input is divisible by 2")
    var k = 0
    while (input >= 2) {
        k++
        input /= 2
        when {
            input > 1000 -> println("Still pretty big...")
            input in 100..999 -> println("Getting smaller now...")
            input < 100 -> println("Almost done!")
        }
    }
    println(" $k times.")
}