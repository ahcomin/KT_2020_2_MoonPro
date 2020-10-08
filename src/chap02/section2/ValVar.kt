package chap02.section2

fun main(){
    val number = 10
    var language = "korean"
    val secondNumber: Int = 20
    language = "English"

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")

}
/* 변수 선언 형태
val username: String = "minyoung"

val username = "minyoung" --> 자료형을 추론하여 String으로 결정
*
*/

/*
카멜 표기법 :  변수의 첫단어 소문자로 시작 다음 문자 대문자 변수, 함수명 지을때
파스칼 표기법 : 첫 단어 대문자로 시작 클래스, 인터페이스 이름
 */

/*
코틀린에서는 참조형만 사용한다! reference type
참조형으로 선언한 변수는 성능 최적화를 위해 코틀린 컴파일러에서 다시 기본형으로 대체된다.
참조형은 대문자로 된 Byte Int 얘네들만 쓴다는말. :)
 */