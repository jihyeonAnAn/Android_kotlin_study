package com.example.fastcampus_part1

fun main(){
     val user = User("안지현", 23)
     println(user.name)
     val kid = Kid("아이", 3, "male")
     println(kid.gender)
}

open class User(open val name: String, open var age: Int)

//상속 - 추천하지 않음
class Kid(override val name: String, override var age: Int) : User(name, age) {
     var gender: String = "female"

     init {
         println("초기화 중 입니다.")
     }

     //부생성자
     constructor(name: String, age: Int, gender: String) :this(name, age) {
          this.gender = gender
          println("부생성자 호출")
     }
}