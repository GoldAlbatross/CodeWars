package interview




fun main() {
    val x: Array<String> = arrayOf("ss","d")
    val c: Array<out Any> = x

    println(x)
    println(c)

}

