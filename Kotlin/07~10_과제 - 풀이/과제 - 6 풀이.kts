fun findSumIsSixFromDice() : List<List<Int>> { // 2차원 List<Int>가 반환형
    val resultList = mutableListOf<List<Int>>()
    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 6) {
                val temp = listOf<Int>(i, j)
                resultList.add(temp)
//              resultList.add(listOf<Int>(i, j))
            }
        }
    }
    return resultList
}
println(findSumIsSixFromDice())