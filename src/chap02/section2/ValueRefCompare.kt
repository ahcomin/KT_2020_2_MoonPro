package chap02.section2
//교수님이 강조하심!!
fun main() {
    val a: Int = 128
    val b = a
    println(a === b) //자료형이 기본현인 int가 되어 값이 동일 true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) //값의 내용만 비교 true
    println(c === d) //값의 내용은 같니만 참조를 비교해 다른 객체 이므로 flase
    println(c === e) // 값의 내용도 같고 참조된 객체도 동일 true
}