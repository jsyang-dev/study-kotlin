package chap04.section3

fun main() {
    retFunc2()
}

fun noInlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc2() {
    println("start of retFunc")
    noInlineLambda(13, 3) { a, b ->
        val result = a + b
        if (result > 10) return@noInlineLambda
        println("result: $result")
    }
    println("end of retFunc")
}
