package chap02.section2.function
/*
fun main()
{
    println("funFunc: ${funcFunc()}")
}
fun sum1(a: Int, b: Int) = a + b

fun funcFunc(): Int { //함수의 반환값으로 함수 호출결과 사용
    return sum(2,3) //return에 함수 호출을 사용.

}



 */
fun main(){
    val funsum: (Int, Int) -> Int = funFunc()
println("funFunc: ${funsum(2,3)}")}

fun sum1(a: Int, b: Int) = a+ b

fun funFunc(): (Int, Int) -> Int {
    println("이 함수는 함수를 리턴합니다.")
    return ::sum1 //함수 참조를 return

}