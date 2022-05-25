fun sumUntil(givenNumber : Int) : Int {
    var sum : Int = 0
    for (i in 1..givenNumber) sum += i
    return sum
}
sumUntil(10)