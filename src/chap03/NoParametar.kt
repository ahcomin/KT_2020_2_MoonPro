package chap03

/*
함수 호출시 인자들 중 맨 마지막 읹가 람다식이면 람다식을 소괄호 밖으로 빼  줄수 있다.
*/

/*
fun main(){
    noParam({"Hello world!"})//매개변수 없는 람다식 함수.
    noParam{"Hello world!"} // 위랑 똑같은것. 매개변수가 없으면 소괄호 생략 가능.
}


fun noParam(out : ()-> String)= println(out()) //out()이 반환한 hello world를 프린트함.




 */
/*

fun main() {
    noParam({ println("Hello world!") })//매개변수 없는 람다식 함수.
    noParam { println("Hello world!") } // 위랑 똑같은것. 매개변수가 없으면 소괄호 생략 가능.
}

fun noParam(out: () -> Unit) = out()


 */

/*
//람다식 함수의 매개변수수

- 인자로 사용된 람다식에 매개 변수가 1개인 경우
: 람다식의 화살표 기호 왼쪽에 필요한 변수를 써준다.
배개변수가 한 개 있을 경우에는 화살표 포함하여 왼쪽 부분을 생략하고 매개변수를 it으로 대체하여
사용 할 수 있다.
 */

fun main(){

    //매개변수가 없는 람다식 함수


}