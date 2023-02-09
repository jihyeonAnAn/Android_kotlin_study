package com.example.fastcampus_part1

fun main(){
    val result1 = test1(1,3)
    println(result1)
}

//2. 함수
fun test1(a: Int, b: Int): Int{
    println(a + b)
    return a+b
}