var score : Int = readLine()!!.toInt()

when {
    score >= 90 -> println("A")
    score >= 80 -> println("B")
    score >= 70 -> println("C")
    else -> println("F")
}
