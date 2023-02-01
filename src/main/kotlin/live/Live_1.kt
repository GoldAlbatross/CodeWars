package live

fun main() {
    val x = mutableListOf<Float?>(1.0f, null, 3.0f, 4.0f, 5.0f)
    x.set(1, 2.0f)
    x.add(2.0f)
    myfun(x)
}

fun myfun(x: MutableList<Float?>) {
    println(x)
}