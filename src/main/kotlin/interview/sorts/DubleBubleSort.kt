package interview.sorts

fun main() {
    val list = mutableListOf(64, 42, 73, 41, 31, 53, 1, 24, 57, 42, 74, 55, 36, 13, 82, 99)

    var count = 0
    println("%04d".format(++count) + " -> $list")

    var isSorted = false
    while (!isSorted) {
        isSorted = true
        for (i in (list.lastIndex-1)downTo 0) {
            if (list[i+1] > list[i]) {
                val temp = list[i]
                list[i] = list[i+1]
                list[i+1] = temp
                isSorted = false
            }
        }
        println("%04d".format(++count) + " -> $list")
    }

    println("step end -> $list")
}