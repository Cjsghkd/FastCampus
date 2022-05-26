class calculater(total : Int = 0) {
    var totalNum = total
    fun calculater(char : Char, num : Int)  {
        when(char) {
            '+' -> println(totalNum + num)
            '-' -> println(totalNum - num)
            '*' -> println(totalNum * num)
            '/' -> println(totalNum / num)
            else -> println("잘못된 연산입니다")
        }
    }
}

calculater().calculater('+', 5)
calculater(9).calculater('-', 5)
calculater(1).calculater('*', 5)
calculater(10).calculater('/', 5)
calculater().calculater('%', 5)