package huge_package

class Test(pass_name: String = "Default User", var age: Int = -1) {
    var name: String = pass_name

    init {
        println("I've shat my pants")
        name = if (name.isBlank()) "Default User" else name.trim()
        println(name)
    }

}