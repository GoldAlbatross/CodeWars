package interview

fun String.getWords():List<String> =
    this.split( " ")


val String.firstWord: String
    get() = this.takeWhile { it != ' ' }




fun main() {
    val str = "How are you"
    println( str.getWords() )
    println( str.firstWord )
}



