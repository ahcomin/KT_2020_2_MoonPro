package chap02.section2.function
//일반함수
//참조에 의한 호출방식으로 함수 호출하기.

fun main() {
    val res1 = funcParam(5, 2, ::add)
    println(res1)

    val res2 = funcParam(5, 2, ::sub)
    println(res2)

    val res3 = funcParam(5, 2, ::mul)
    println(res3)

    val res4 = funcParam(5, 2, ::div)
    println(res4)
}

fun add(a: Int, b: Int) = a + b

fun sub(a: Int, b: Int) = a - b

fun mul(a: Int, b: Int) = a * b

fun div(a: Int, b: Int) = (a / 5).toInt()

fun funcParam(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

