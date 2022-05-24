fun abc() {
    val numbers1 = listOf<Int>(1, 2, 3, 4, 5, 6)
    val numbers2 = listOf<Int>(1, 2, 3, 4, 5, 6)
    for (i in (numbers1.indices)) {
        for (j in (numbers2.indices)) {
            if ((numbers1[i] + numbers2[j]) == 6) {
                print(numbers1[i])
                print(" ")
                println(numbers2[j])
            }
        }
    }
}

abc()
