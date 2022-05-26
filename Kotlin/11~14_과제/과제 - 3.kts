class calculater() {
    var total : Int = 0
    fun calculater(calculation : List<Char>, num : List<Int>) { // vararg = 가변인자이며, 인자(파라미터)의 갯수를 유동적으로 바꿔줄 수 있다
        for (i in num.indices) {
            when (calculation[i]) {
                '+' -> total += num[i]
                '-' -> total -= num[i]
                '*' -> total *= num[i]
                '/' -> total /= num[i]
            }
        }
        println(total)
    }
}
calculater().calculater(listOf<Char>('+', '-', '*', '/'), listOf<Int>(40, 30, 20, 10))
