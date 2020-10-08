package chap02

import chap02.section1.Person as User
/*
다른 패키지에 같은 이름의 클래스가 있으면 이름의 혼동이 있을 수 있다.
as 키워드로 클래스 이름에 별명을 붙여서 혼동이 발생하지 않게 한다.
 */

fun main() {
    val user1 = User("kildong", 30)
    val user2 = Person("A123", "kildong")

    println(user1.name)
    println(user1.age)
    println(user2.id)
    println(user2.name)

}
class Person(val id: String, val name: String)


