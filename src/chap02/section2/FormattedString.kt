package chap02.section2
/*
다중 문자열 사용하기
"""""" 여러 줄의 문자열 형식화 하기.
 */
fun main(){
    val num = 10
    val formattedString = """
var a = 6
var b = "Kotlin"
println(a + num) // num의 값은 $num"""
    println(formattedString)
}

// """""" 안에 있는 코드들은 모두 문자열로 출력된다.

/*
자료형에 별명 붙이기
: typealias

typealias Username = String  //string 을 Username이라는 별명으로 대체
val user : Username = "kildong" //이제부터 Username은 String과 같은 표현.

 */
/*

tony hoare - the billion mistake

- 코틀린의 변수 선언은 기본적으로 null을 허용하지 않는다.
- null 이 가능한 선언 --> 자료형 뒤에 ? 를 붙여 표현한다
val a: Int? = null
var b: String? = null

 */