// 함수를 선언하는 방법
fun plusNumbers(first_num : Int, second_num : Int) : Int {
    val result : Int = first_num + second_num
    return result
}

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