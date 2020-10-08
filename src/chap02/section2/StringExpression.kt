package chap02.section2
/*
var a = 1
val s1 = "a is $a" //String 자료형의 s1을 선언하고 초기화. 변수 a가 사용됨.
 */
fun main() {
var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a+2}" //문자열에 표혀식 사용
    println("str1: \"$str1\", str2 : \"$str2\"")
}