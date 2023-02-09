package com.example.fastcampus_part1

fun main(){
    val result1 = test1(1,3)
    val result2 = test2("안지현", "지현", "jh011007")
    val time1 = time1(3,4)
    val time2 = time2(3,4)

    println(result1)
    println(result2)
    println(time1)
    println(time2)
}

//2. 함수
fun test1(a: Int, b: Int): Int{
    println(a + b)
    return a+b
}

fun test2(name: String, nickName: String, id: String) = println(name + nickName + id)

fun time1(a: Int, b: Int) : Int{
    return a*b
}
fun time2(a: Int, b: Int) = a * b