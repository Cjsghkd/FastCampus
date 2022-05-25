fun killNthArmy(
    firstAmy : List<String>,
    secondAmy : List<String>,
    killNth : Int
) : List<List<String>>? {
    if (firstAmy.size < killNth || secondAmy.size < killNth) return null
    val firstAmyTemp = mutableListOf<String>()
    val secondAmyTemp = mutableListOf<String>()
    for ((index, army) in firstAmy.withIndex()) { // firstAmy의 인덱스, 값을 가져와 자신이 정한 변수에 대입한다
        if (index != killNth) firstAmyTemp.add(army)
    }
    for ((index, army) in secondAmy.withIndex()) { // secondAmy의 인덱스, 값을 가져와 자신이 정한 변수에 대입한다
        if (index != killNth) secondAmyTemp.add(army)
    }
    val result = listOf<List<String>>(firstAmyTemp, secondAmyTemp)
    return result
}

println(
    killNthArmy(
        firstAmy = listOf<String>("A", "B", "C", "D", "E"),
        secondAmy = listOf<String>("A", "B", "C"),
        killNth = 2
    )
)