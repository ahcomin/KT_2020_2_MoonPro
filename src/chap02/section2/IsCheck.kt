package chap02.section2

//자료형 검사하기

fun main(){
    val num = 256

    if (num is Int) { //num이 Int형일 때
        println(num)

    }
    else if (num !is Int){
        print("Not a Int")
    }
}