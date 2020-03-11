package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFun() {
        i += 1
    }
    fun access() {
        privateFun()
    }
}

class OtherClass {
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
}

fun TopFunction() {
    val tpc = PrivateClass()
}