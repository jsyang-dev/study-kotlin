package chap03.section5

fun main() {
    shortCrossinlineFunc(3) {
        println("First call: $it")
//        return
    }
}

inline fun shortCrossinlineFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc {out(a)}
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}
