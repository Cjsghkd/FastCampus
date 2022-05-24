// label + break
loop@for (i in 1..3) { // i 반복문
    println(i)
    for (j in 1..3) { // j 반복문
        if (j == 2) break@loop // 구문 1
        else println(j) // 구문 2
    }
}
// i1 -> j1/구문1 -> j1/구문2 -> j2/구문1 -> loop 탈출(i반복문)
println("------------")
// label + continue
loop@for (i in 1..3) { // i 반복문
    println(i)
    for (j in 1..3) { // j 반복문
        if (j == 2) continue@loop // 구문 1
        else println(j) // 구문 2
    }
}
// i1 -> (j1/구문1 -> j1/구문2) -> (j2/구문1) -> i2 -> (j1/구문1 -> j1/구문2) -> (j2/구문1) -> i3 -> ...
println("------------")
// lable + foreach
// foreach는 continue와 break 사용 불가
listOf(1, 2, 3).forEach loop@{
    if (it == 2) return@loop
    else println(it)
}