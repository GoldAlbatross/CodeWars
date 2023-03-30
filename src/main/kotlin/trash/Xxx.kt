package trash

import level_6kyu.strings.State2

fun main() {
    val str = "John Daggett, 341 King Road, Plymouth MA"


    val x = str.split(",").joinToString("") {it + " xxx"}

    println(x)


}