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
            if (j == 11) continue@fuckass
        }
        i--
        println(i)
    } while (i != 3)

}
