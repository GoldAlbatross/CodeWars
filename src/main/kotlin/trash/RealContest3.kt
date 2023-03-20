package trash

import java.util.*


//     12 aabbccddbadd        5
//      16 aaaabbbbccccdddd   10
// dbbccca             7
// abcabac            -1

fun main() {


    val scn = Scanner(System.`in`)

    var length = scn.nextInt()
    var str = scn.nextLine().drop(1)

    var count = 4
    var isSorted = false
    while (!isSorted) {
        isSorted = true
        for (i in 0..str.lastIndex - count) {
            var x = str.substring(i, i + count)
            if (x.contains("a")) {
                if (x.contains("b")) {
                    if (x.contains("c")) {
                        if (x.contains("d")) {
                            println(count)
                            isSorted =true
                            break
                        } else isSorted = false
                    } else isSorted = false
                } else isSorted = false
            } else isSorted = false
        }
        count++
    }





}