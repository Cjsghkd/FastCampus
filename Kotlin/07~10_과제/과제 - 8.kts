fun abc(oneList : MutableList<String>, twoList : MutableList<String>, number : Int) {
    if (oneList.size < (number - 1)) {
        return
    } else if (twoList.size < (number - 1)) {
        return
    } else {
        oneList.removeAt(number)
        twoList.removeAt(number)
        var addList = mutableListOf<String>()
        addList.addAll(oneList)
        addList.addAll(twoList)
        println(addList)
    }
}

var oneList = mutableListOf<String>("A", "B", "C", "D", "E")
var twoList = mutableListOf<String>("A", "B", "C")
val number : Int = 2

abc(oneList, twoList, number)