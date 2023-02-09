package com.example.fastcampus_part1

fun main() {

    // 1..10 == IntRange(1, 10)
    for(i in 1..10){
        print(i)
        print(".")
    }

    // until : 끝 숫자 포함 안 함
    for(i in 1 until 10){

    }

    for(i in 1..10 step(2)){
        print(i)
        print(".")
    }

    //숫자 작아지게 하기 : downTo
    for(i in 10 downTo 1){

    }

    for(i in 10 downTo  1 step(2)){

    }

    var c = 1
    while(c < 11) {
        print(c)
        print(".")
        c++
    }
}