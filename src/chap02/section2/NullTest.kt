package chap02.section2
//p.70
/*
- 변수
1. val --> 불변형
: 변경 불가능한 참조를 저장하는 변수. 초기화 하고 나면 재대입이 불가능
자바의 final변수에 해당함.

2.var --> 가변형
: 변경 가능한 참조
자바의 일반 ㅂ녀수에 해당함.

기본적으로 모든 변수는 val 키워드를 사용해 불변 변수로 선언하고,
나중에 꼭 필요할 때만 var로 변경하여라!

 */


/*
fun main() {
    var str1: String = "hello Kotlin"
    str1 = null //null 을 허용하지 않음 (오류발생)
    println("str1: $str1")
}

 */


// null 값을 넣고 싶을때!!
fun main() {
    var str1:String? = "hello kotlin"
    str1 = null //에러 발생하지 않음
    println("str1 : $str1")
}

/*
java vs kotlin

java 에서는 @NotNull 과 @Nullable 어노테이션을 통해 알리지만
kotlin 에서는 기본적으로 NotNull 이고 Nullable 표현에만 '?'가 사용된다.

 */
fun a(){
var temp : String? = null
var size = -1
if (temp != null){
    size = temp.length
}
}

//or 위에와 같은 식

fun b(){
    var temp: String? = null
    val size = if (temp != null) temp.length else -1

}

/*
세이프 콜과 엘비스 연산자를 활용해 null을 허용한 변수 더 안전하게 사용하기.

- 세이프 콜 (safe-call) ?.
 : str1?.lengh :str1이 null이면 null을 리턴하고, str1이 null이 아니면 lengh를 호츌.

- non_null 단정기호 !!
 :
 */

//조건문을 활용해 null을 허용한 변수 검사하기.
/*
조건문으로 null을 허용한 변수를 검사해도 된다.
null을 허용한 변수의 null 상태 가능성을 검사하기만 하면 코틀린 컴파일러는 오류를 발생시키지 않는다.

 */
fun ifelse(){
    var str0 : String? = "halo kotlin"
    str0 = null
    //조건식을 통해 null 상태 검사
    val len = if (str0 != null) str0.length else -1

    println("str0 : $str0 length : ${len}")

}

fun c(){
    val a: Int = 1
    val b : Double =a.toDouble() //자료형 변환 메서드 사용

    /*
    - 표현식에서 자료형의 자동 변환
    자료형이 표현할 수 있는 범위가 큰 자료형으로 자동 형 변환하여 연산함.
     */
    val result = 1L + 3// long  + Int -> result 는 Long

}

/// === 는 참조 주소를 비교할 때 씀.
//참조 주소가 같으면 당연히 값도 같다.
