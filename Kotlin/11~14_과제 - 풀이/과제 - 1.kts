class Calculater() {
    var result : Int = 0
        set(value) {
            field = value
            println("중간 계산 값 : " + field)
        }

    fun sum(inputNumber : Int) {
        result += inputNumber
    }
    fun minus(inputNumber : Int) {
        result -= inputNumber
    }
    fun multiply(inputNumber : Int) {
        result *= inputNumber
    }
    fun devide(inputNumber : Int) {
        result /= inputNumber
    }
}

val calculater1 = Calculater()
calculater1.sum(10)
calculater1.devide(2)
calculater1.multiply(3)