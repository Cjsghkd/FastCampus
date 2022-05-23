// List
val numbers = listOf<Int>(1, 2, 3)
println(numbers[0])
println(numbers.get(1))
println(numbers.indexOf(2))
println(numbers.last())

val numbers2 = mutableListOf<Int>(1, 1, 1, 2, 3)
println(numbers2.add(50))
println(numbers2.removeAt(0))
println(numbers2)
// numbers[0] = 3 -> immutable은 불변
//numbers2[0] = 3
//println(numbers2)


// Set
val number3 = setOf<Int>(1, 1, 1, 3, 3, 4)
val number4 = mutableSetOf<Int>(1, 1, 1, 3, 3 ,4)
//println(number3)

// Map
val number5 = mapOf<Int, String>(1 to "one", 2 to "two")
val number6 = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))
//println(number5)
//println(number6)
