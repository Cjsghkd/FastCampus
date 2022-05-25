fun sum7s() : Int {
    var sum : Int = 0
    for (i in 1..100) {
        if (i % 7 == 0) sum += i
    }
    return sum
}
sum7s()