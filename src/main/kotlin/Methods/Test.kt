package level_7kyu

import kotlin.math.ceil

fun main() {
    //removeRange()
    var x = "01234567"
    x = x.removeRange(1, 7)

    //reduce()
    val text = listOf("Tom", "Jon", "Mike", "Eva")
    val result = text.reduce { acc, s -> "$acc $s"}

    //ceil()
    var num = 101
    num = ceil(num/100.0).toInt()


    println(result)
}
fun expressionsMatter(a: Int, b: Int, c: Int): Int =
    maxOf(a+b+c, (a+b)*c, a*(b+c), a*b*c)

fun filterEven(s: String): String {
    return s.replace(Regex("[eyuioa]"),"")
}