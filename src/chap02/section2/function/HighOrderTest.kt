package chap02.section2.function
/*
람다식을 인자나 반환값으로 사용하는 고차함수

* 변수에 지정된 람다식의 형태 :{[매개변수들 ->] 표현식들}
[]는 생략 가능.

* 람다식의 구성 :
    - 람다식 내용에 표현식이 2줄 이상일 때 마지막 표현식이 반환값이 된다.
    - 변수의 자료형 혹은 매개변수의 자료형 생략 가능하다.
    val multi : (Int, Int) -> Int = {x : Int, y: Int -> x * y} //생략되지 않은 전체 표현
    val multi : {x: Int, y: Int -> x * y} // 변수 선언자료형의 추론이 가능하므로 생략
    val multi : (Int, Int) -> Int {x, y -> x * y} // 람다식 매개변수 자료형의 생략
    val multi : {x, y -> x * y} //에러!! 올바르지 않은 형태!! xxx
    - 반환 자료형이 없거나 매개변수가 하나 있을ㄷ 때
    val greet: () -> unit = {println("Hello world!")} //매개변수 x, 자료형은 unit
    val square : (Int) -> Int {x -> x * x} //정수 매개변수 1개, 리턴되는 정수 1개
    - 람다식 안에 람다식이 있는 경우 :
    vla nestedLamda: ()->()->unit = {{prinln("nested"}} //매개변수를 하나도 호출하지 않은 람다식 2개
    - 추론으로 선언부의 자료형은 생능략 가능하다.
    val greet = {println("hello World")} //추론 가능.
    val square = {x : Int -> x * x} //선언 부분을 생략하려면 x의 자료형을 명시해야한다.
    val nestedLamda = {{ println("nested")}} // 추론 가능.
 */
//고차함수.
/*1.
fun main() {
    var result: Int
    //일반 변수에 람다식 대입
    val mulit = { x: Int, y: Int -> x * y } //람다식 함수(형태) 라고 부른다.
    result = mulit(10, 20)
    println(result)
}


 */

/*2.
fun main() {
    var result: Int
    //일반 변수에 람다식 대입
    val mulit = { x: Int, y: Int -> x * y } //람다식 함수(형태) 라고 부른다.
    result = mulit(10, 20)
    println(result)


    //이런형태로 이용가능.
    //일반 변수에 다른 변수에 저장하여 함수 이용가능.

    val mul = mulit     //  mulit 변수에 대입된 람다식
    result  = mul(3,5)
    println(result)
}

 */

fun main() {
    var result: Int
    val sum = { a: Int, b: Int -> a + b }
    val multi = { sumFunc: (Int, Int) -> Int, y: Int ->
        println("더할 두 수를 입력하세요 : ")
        println("첫 번째 수는?")
        val firstNumver = readLine()!!.toInt()
        println("두 번째 수는?")
        val secondNumber = readLine()!!.toInt()
        sumFunc(firstNumver, secondNumber) * y
    }

    //람다식이 대입된 변수는 함수처럼 사용 간으
    result = multi(sum,20) //함수 이름을 인자로 사용.
    println(result)

    result = multi({a : Int, b:Int -> a+b}, 30)
    //sum 변수를 넣어도 되지만 람다식 자체를 넣어줘도 똑같다.
    println(result)

}
