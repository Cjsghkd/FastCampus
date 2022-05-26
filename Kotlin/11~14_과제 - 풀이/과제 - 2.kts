class Calculater constructor(val initialValue : Int = 0){
    var result : Int

    init {
        this.result = initialValue
    }

    fun calculater(function : Char, inputNumber : Int) {
        when(function) {
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *= inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산 입니다")
        }
    }
}

val calculater1 = Calculater(10) // 만든 사람의 의도를 더 보여준다
calculater1.calculater('+', 10)
calculater1.calculater('/', 20)
calculater1.calculater('-', 100)
println(calculater1.result)

//class Calculater2 constructor(val result : Int = 0) { 이런 방식도 있다
//
//}
//Calculater2(10)