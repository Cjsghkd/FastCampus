// range
for (value in 0..3) {
    println("반복")
}

// progression + step
for (value in 0..5 step(2)) { // 0 -> 2 -> 4
    println("반복1")
}

// progression + downTo
for (value in 5 downTo 0) {
    println("반복2")
}

val numbers = listOf<Int>(5, 6, 7, 8)
for (number in numbers) {
    println(number)
}

println(numbers.size) // 1 부터 셈 -> (1, 2, 3, 4)
for (i in 0..numbers.size) { // 0..4
    println("반복3")
}

for (i in 0 until numbers.size) { // 0..3
    println("반복4")
}

for ((index, number) in numbers.withIndex()) { // 첫째 줄은 인덱스, 두번째 줄은 실제 값을 출력한다
    println("" + index+ " | " + number)
}

// forEach
numbers.forEach {
    println(it)
}

numbers.forEach { number ->
    println(number)
}

