fun abc() {
    val score = listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99)
    var check = mutableListOf<String>("A", "B", "C", "D", "E", "A", "B", "C", "D", "E")

    for (i in 0..(score.size - 1)) {
        if (score[i] >= 80) {
            check[i] = "True"
        } else {
            check[i] = "False"
        }
    }
    println(check)
}

abc()
