package chap02.section2.function
// 함수 만들기.
 /*
 인자 :  함수를 호ㅜㄹ할때 사용된 것.
 매개변수 : 함수를 선언할 때 사용된 것. -> a,b

  */
fun sum(a : Int, b: Int) :Int {
    var sum = a+b
    return sum
}

fun main(){
    val result1 = sum(3,2)
    val result2 = sum(6,7)
    println(result1)
    println(result2)
}