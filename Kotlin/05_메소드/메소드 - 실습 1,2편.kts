var number100 : Int = 100

// 함수를 선언하는 방법
fun plusNumbers(first_num : Int, second_num : Int) : Int {
    val result : Int = first_num + second_num
    return result
}

// first_num = 200
// println(first_num) -> 함수 안에서 사용하는 변수(파라미터)는 함수 범위(괄호)안에서만 사용가능하다

// 함수를 사용(호출)하는 방법
plusNumbers(first_num = 10, second_num = 20) // -> 30
plusNumbers(10, 20) // -> 30

val result : Int =  plusNumbers(5, 7)
println(result)

// 기본값이 있는 함수를 선언하는 방법
fun plusNumbersWithDefault(first_num : Int, second_num : Int = 10) : Int {
    return first_num + second_num
}

val result2 : Int = plusNumbersWithDefault(10)
println(result2)
val result3 : Int = plusNumbersWithDefault(10, 20)
println(result3)

// 반환값이 없는 함수를 선언하는 방법
fun plusNumbersWithNoReturn(first_num : Int, second_num : Int) : Unit {
    val result : Int = first_num + second_num
    println(result)
}
plusNumbersWithNoReturn(100, 200)

fun plusNumbersWithNoReturn2(first_num : Int, second_num : Int) {
    val result : Int = first_num + second_num
    println(result)
}
plusNumbersWithNoReturn2(100, 200)

fun plusNumbersWithNoReturn3(first_num : Int, second_num : Int) {
    val result : Int = first_num + second_num
    println(result)
    return  // return만 쓰는 것은 되지만 반환값은 쓰면 안된다
}
plusNumbersWithNoReturn3(100, 200)

// 함수선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum : Int, secondNum : Int) = firstNum + secondNum
val result4 : Int = shortPlusNumbers(firstNum = 10,secondNum = 100)
println(result4)

// 가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers : Int) : Unit {
    for (number in numbers) {
        println(number)
    } // numbers에 들어온 값들을 하나하나 돌면서 println을 진행한다

    // println(numbers)
}
plusMultipleNumbers(1, 2, 3, 4, 5)

number100 = 200
println(number100)