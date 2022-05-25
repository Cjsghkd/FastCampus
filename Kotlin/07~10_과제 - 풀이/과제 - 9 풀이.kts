fun gugudan(dan : Int) {
    val numbers = mutableListOf<Int>()
    for (i in 1..9) {
        numbers.add(dan * i)
    }
    println(numbers)
}
gugudan(8)