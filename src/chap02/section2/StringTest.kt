package chap02.section2

/*
문자열 :
String으로 선언되며 String pool이라는 공간에 구성된다
 */

fun main(){
    var str1 : String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2 : ${str1 ===str2}")
    println("str1 ===str3 : ${str1 ===str3}")

    //주소가 같ㅋ은지 물어보는것!
}