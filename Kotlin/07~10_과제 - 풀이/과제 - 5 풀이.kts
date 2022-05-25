fun checkPassOrNot(examScores : List<Int>) : BooleanArray {
    // val resultArray = booleanArrayOf() // booleanArrayOf()의 반환형은 BooleanArray이므로 실행 X?
    // return resultArray

    val resultArray = BooleanArray(examScores.size, { false }) // 크기가 examScores의 갯수이고 기본값이 false인 배열 생성
    examScores.forEach { index, score ->
        if (score >= 80) resultArray[index] = true
        // else resultArray[index] = false // 이미 기본값이 false
    }
    return resultArray
}

val result = checkPassOrNot(listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99))
result.forEach {
    println(it)
}