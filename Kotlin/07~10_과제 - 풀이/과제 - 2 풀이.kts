fun sumUntil(givenNumber : Int) : Int {
    var sum : Int = 0
    for (i in 1..givenNumber) sum += i
    return sum
    // 0부터 10 까지의 합 = 0부터 10 까지의 인덱스의 합
}
sumUntil(10)