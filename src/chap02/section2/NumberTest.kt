package chap02.section2

//스마트 캐스트

fun main(){
    var test: Number = 12.2
    println("$test")

    test = 12 //Int 로 스마트 캐스트 (자동으로)
    println("$test")


    test = 120L //long형으로 스마트 캐스트
    println("$test")

    test += 12.0f //float 형으로 스마트 캐스트
    println("$test")
}

//as 에 의한 스마트 캐스트
/*
as 는 형 변환이 가능하지 않으면 예외를 발생시킨다

- y 가 null이 아니면 String 으로 형 변환되어 x에 할당되고 y가 null 이면 형변환을 할 수 없으므로 예외가 발생
val x: String = y as String

- as?
: null 가능성까지 고려

val x: String? = y as? String

 */

