val inputs = listOf<Char>('A', 'B', 'E')
val number : Int = 3

fun abc(number : Int) {
    for (i in 1..number) {
        println(i)
        for (j in inputs) {
            print(j)
        }
        println("")
    }
}

abc(number)
