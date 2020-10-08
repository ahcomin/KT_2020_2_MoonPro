package chap02.section2.function

/*
람다식 이름을 사용한 호출 이용하기.

- 함수 변수를 인자로 전달한 경우
    매개변수는 함수 타입으로 선언되고
    함수의 레퍼런스 값을 전달 받는다.
- 인자 : 람다식 변수 이름
- 매개변수 : 람다식 함수 자료형
 */
fun main() {
    val result = callByName(otherlamda)
    println(result)

}

fun callByName(b: () -> Boolean): Boolean { // 람다식 함수 자료형으로 선언된 매개변수
    println("callByName function")
    return b() // 여기서 람다 함수 호출
}

val otherlamda: () -> Boolean = {
    println("otherLamda funcion")
    true
}

/*
함수의 참조
다른 함수의 참조에 의한 호출

- 람자식이 아닌 일반 함수를 다른 함수의 인자로 호출하는 경우
fun sum(x: Int, y: Int) = x + y
funcParam(3,2,sum) // error! sum 은 람다식이 아님
fun funcparam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
return c(a,b)
}

- 인수로 넘기고 싶은 함수 sum()과 funcParam() 의 매개변수 c의 선언부 구조가 같으면
 인수 ::sum으로 함수를 전달한다.

- 일반 함수를 다른 함수의 인자로 넘길 떄는 ::함수이름을 사용한다

- 받는 쪽의 매개변수는 함수 타입으로 선언되어야 한다.
funcParam(3,2, ::sum)
fun funcOaram(a: Int, b:Int, c: (Int, Int) -> Int): It{...}
 */