package chap02.section2.function

// 인자와 반환값이 없는 람다식 함
fun main() {
    val out: () -> Unit = { println("hello!") }
    //추론이 가능하므로 val out= {println("hello!")} 와 같이 생략 가능
    //람다식이 들어있는 변수를 다른 변수에 대입
    out() // 함수처럼 사용

    val new = out // 변수처럼 대입해 재사용 가능
    new()
}

