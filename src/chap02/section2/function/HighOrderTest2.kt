package chap02.section2.function
/*


fun main() {
    var result: Int
    result = highOrder({ x, y -> x + y }, 10, 20)
    println(result)


}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
//람다식 함수를 인자로 사용한 고차 함수
    return sum(a, b)
}

 */

//람다식은 마지막 표현식이 반환값이 된다.

fun main(){

    var result : Int

    //여러 문장으로 된 람다식을 매개변수와 인자로 사용된 함수.
    result = highOrder({ x, y -> println("First number is ${x}, second numver is ${y}")
    x+y}, 10, 20)

    println(result)
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b:Int): Int {
    return sum(a,b)
}