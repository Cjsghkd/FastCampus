fun splitNumbers(firstIntList : List<Int>, secondIntList : List<Int>) : Map<String, List<Int>> {
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val eventNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach { number ->
        if (number % 2 == 0) eventNumber.add(number)
        else oddNumber.add(number)
    }
    result.put("짝수", eventNumber)
    result.put("홀수", oddNumber)
    return result
}
println(
    splitNumbers(
        firstIntList = listOf<Int>(1, 2, 3, 4, 5),
        secondIntList = listOf<Int>(6, 7, 8, 9, 10)
    )
)