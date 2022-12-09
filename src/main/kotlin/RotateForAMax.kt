
fun main() {
    maxRot(896219342L)
}

fun maxRot(n:Long):Long {
    println("896219342")
    val s: MutableList<Char> = n.toString().toMutableList()

    var x = 0L
    for (i in 0 until s.size-1) {
        println("индекс $i, value ${s[i]} переносим в конец списка")
        s.add(s[i])
        s -= s[i]
        x = maxOf(x, methodOfHorner(s))
    }
    return x
}
fun methodOfHorner(s: MutableList<Char>): Long {
    var n = 0L
    for (e in s.map { it.digitToInt() })
        n = 10 * n + e
    println(n)
    return n
}

    


