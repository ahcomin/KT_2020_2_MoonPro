package chap02.section2

/*
<묵시적 변환>
- 모든 클래스의 뿌리 Int or String은 Any 형의 자식 클래스이다.
- 자바의 Object와 유사함.
- 자료형이 정해지지 않은 경우에 사용!

Any는 언제든 필요한 자료형으로 자동 변환이 가능(스마트 캐스트)

 */

fun main(){
    var a: Any = 1
    println("a: $a type: ${a.javaClass}")
    a= 20L
    println("a: $a type: ${a.javaClass}")
}

/*
Any 형으로 인자를 받는 함수 만들기
 */

fun aa(){
    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any){
    if (x is String)
        println("x is String : $x")
    if (x is Int)
        println("x is Int : $x")
}