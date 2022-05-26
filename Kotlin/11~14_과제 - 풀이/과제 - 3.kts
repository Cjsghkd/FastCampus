class Calculater3() {
    var result : Int = 0
    fun calculate(operaters : List<Char>, inputNumbers : List<Int>) {
        operaters.forEachIndexed { index, operater ->
            _calculate(operater, inputNumbers[index])
        }
    }

    fun _calculate(function : Char, inputNumber : Int) { // 이름을 정할때 _을 사용한다면 안에서 사용한다는 암묵적인 의미이다
        when(function) {
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *= inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산 입니다")
        }
    }
}
val calculater3 = Calculater3()
calculater3.calculate(listOf<Char>('+', '-'), listOf<Int>(10, 20))
println(calculater3.result)


// ['+', '-', '*'], [10, 20, 30]

//[('+', 50) ('-', 60)]
//[(Any, Any) (Any, Any)] -> 실제
//[(Char, Int) (Char, Int)] -> 기대
// Any -> Char, Int 으로 변환   ->  아직 배우지 않았다