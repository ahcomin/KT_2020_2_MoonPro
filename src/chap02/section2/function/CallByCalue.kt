package chap02.section2.function

/*
람다식과 고차함수 호출하기

시험에 값에 의한 호출(call by value) 나올 것같애
: 자바나 코틀린은 함수를 호출할 때 인자의 값만 복사함.
 */
// 람다식 함수 호출을 인자로 전달한 경우매개변수는 함수의 반환타입으로 선언되고 함수의 반환값을 전달 받는다.


fun main(){
    val result = callByValue(lamda())
    println(result)

}

fun callByValue(b: Boolean): Boolean{
    println("callbyValue function")
    return b
}
val lamda:() -> Boolean = { //람다 표현식이 두줄이다.
    println("lamda function")
    true
}

