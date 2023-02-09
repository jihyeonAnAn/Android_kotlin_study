package com.example.fastcampus_part1

fun main(){
    max(10, 20)
    isHoliday("금")
    isHoliday2("화")
}

fun max(a: Int, b: Int) {

    val result = if(a>b){ //중괄호 생략 가능
        a
    } else {
        b
    }

    println(result)
}

fun isHoliday(dayOfWeek: String){
    val result = when(dayOfWeek){
        "월" -> false
        "화",
        "수",
        "목",
        "금" -> false
        "토",
        "일" -> true
        else -> false
    }
    println(result)
}
fun isHoliday2(dayOfWeek: Any){
    val result = when(dayOfWeek){
        "토",
        "일" -> if(dayOfWeek == "토") "좋아" else "너무 좋아"
        in 2..4 -> {}
        in listOf("월", "화") -> "월 아니면 화"
        else -> "안좋아"
    }
    println(result)
}