package edu.cnm.deepdive

fun main() {
    for (i in 1..100) {
        val output = FizzBuzzView.render(i, FizzBuzz.convert(i))
        println(output)
    }
}