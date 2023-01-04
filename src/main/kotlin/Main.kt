fun main() {
    greet("Herbie", 4)
    println(getMax(14, 1))
    println(double(37567))
}

fun double(i: Int) = i * 2

fun getMax(i: Int, j: Int) = if (i >= j) i else j

/***
 * greets the passed name, repeats the greeting reps times, default 1
 */
fun greet(name: String, reps: Int = 0) {
    for (i in 0 until reps) {
        println("Hello $name, nice to meet you!")
    }
}