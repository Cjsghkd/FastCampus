fun abc(oneList : List<Int>, twoList : List<Int>) {
    var totalList = mutableMapOf<String, Int>()
    for (i in oneList.indices) {
        if (oneList[i] % 2 == 0) {
            totalList.put("짝수${i + 1}", oneList[i])
        } else {
            totalList.put("홀수${i + 1}", oneList[i])
        }
    }

    for (j in twoList.indices) {
        if (twoList[j] % 2 == 0) {
            totalList.put("짝수${j + 1}", twoList[j])
        } else {
            totalList.put("홀수${j + 1}", twoList[j])
        }
    }
    println(totalList)

}

val oneList = listOf<Int>(1, 2, 3)
val twoList = listOf<Int>(4, 5, 6)

abc(oneList, twoList)