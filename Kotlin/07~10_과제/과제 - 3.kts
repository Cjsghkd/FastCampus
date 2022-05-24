fun abc() {
    var total : Int = 0
    for (i in 1..100) {
        if (i % 7 == 0) {
            total += i
        }
    }
    println(total)
}

abc()