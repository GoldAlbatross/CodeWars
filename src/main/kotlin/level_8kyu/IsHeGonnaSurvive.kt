package level_8kyu

import kotlin.time.Duration.Companion.microseconds

fun main() {
    println(hero(10,5))
    println(hero1(10,5))
    }


fun hero(bullets: Int, dragons: Int) : Boolean =
    bullets.div(dragons) >= 2

fun hero1(bullets: Int, dragons: Int) : Boolean =
    bullets >= dragons*2