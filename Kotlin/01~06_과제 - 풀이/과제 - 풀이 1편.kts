// 1번
val A : Int = 10 // val A : Short = 10
val B : Int = 10
val C : Boolean = if (A == B) true else false
println(C)
// 자료형이 다르면 비교연산자를 사용할수 없다

// 2번
val AA : Int = 10
val BB : Int = AA * 2

// 3번
fun checkGrade(score : Int) : String {
//    if (score >= 90) return "A학점"
//    else if (score >= 80) return "B학점"
//    else if (score >= 70) return "C학점"
//    else return "F학점"

    when(score) {
        in 90..100 -> return "A학점"
        in 80..89 -> return "B학점"
        in 70..79 -> return "C학점"
        else -> return "F학점"
    }
}

val result : String = checkGrade(90)
println(result)