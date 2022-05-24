// break
for (i in 1..3) { // i 반복문
    println(i)
    for (j in 1..3) { // j 반복문
        if (j == 2) break // 구문 1
        else println(j) // 구문 2
    }
    // i1 -> (j1/구문1 -> j1/구문2) -> (j2/구문1) -> i2 -> (j1/구문1 -> j1/구문2) -> (j2/구문1) -> i3 -> ...
}
println("------------")
// continue
for (i in 1..3) { // i 반복문
    println(i)
    for (j in 1..3) { // j 반복문
        if (j == 2) continue // 구문 1
        else println(j) // 구문 2
    }
    // i1 -> (j1/구문1 -> j1/구문2) -> (j2/구문1) -> (j3/구문1 -> j3/구문2)
}
println("------------")
// return
fun returnFunction() : Unit {
    for (i in 1..3) { // i 반복문
        println(i)
        for (j in 1..3) { // j 반복문
            if (j == 2) return // 구문 1
            else println(j) // 구문 2
        }
    }
}
returnFunction()
// i1 -> (j1/구문1 -> j1/구문2) -> (j2/구문1)
