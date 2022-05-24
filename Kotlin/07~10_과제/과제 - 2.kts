fun abc(number : Int) {
    var total : Int = 0
    for (i in 1..number) {
        total += i
    }
    println(total)
}

abc(10)