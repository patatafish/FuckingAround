fun main() {
    val names = arrayOf("one", "two", "three", "farts")

    for (i in names.indices) {
        println("$i: ${names[i]}")
    }

    for (name in names) {
        println(name)
    }

    for (i in 1..10 step 3) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }
}
