package level_8kyu

fun main() {
    val q = Array(2) {3.2}
    sum(q)
}

fun sum(x: Array<Double>) {
    val y = x.sum()
    println(y)
}