

fun String.getWords():List<String> {
    return this.split( " ")
}

val String.firstWord: String
    get() = this.takeWhile { it != ' ' }




fun main() {
    val str = "How are you"
    println( str.getWords() )
    println( str.firstWord )
}



