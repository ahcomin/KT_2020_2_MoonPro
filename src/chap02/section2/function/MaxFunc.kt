package chap02.section2.function
//스
fun main(){
    val num1 = 10
    val num2 = 3
    val result:Int
     result = max(num1, num2)
    println(result)

}

fun max (a: Int, b: Int) = if (a>b) a else b


//반환값이 없는 함수 
/*
Unit 형 : 코틀린에서 반환값이 없을 때 사용


 */

fun printSum(a: Int, b : Int) : Unit{
    println("sum of $a is ${a+b}")
}

