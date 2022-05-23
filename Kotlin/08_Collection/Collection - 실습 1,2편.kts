// List
val numbers = listOf<Int>(1, 2, 3)
println(numbers[0])
println(numbers.get(1))
println(numbers.indexOf(2)) // 해당하는 값의 인덱스 출력 [ex) 2 -> numbers의 인덱스 1이므로 1출력]
println(numbers.last())

val numbers2 = mutableListOf<Int>(1, 1, 1, 2, 3)
println(numbers2.add(50))
println(numbers2.removeAt(0))
numbers2.addAll(2, listOf<Int>(100, 100)) // 내가 정한 인덱스에 추가하기
println(numbers2)
// numbers[0] = 3 -> immutable은 불변
//numbers2[0] = 3
//println(numbers2)


// Set
val number3 = setOf<Int>(1, 1, 1, 3, 3, 4)
number3.contains(1) // 쓴 값이 있는지 확인한다
number3.containsAll(setOf<Int>(1, 3))
println(number3)

val number4 = mutableSetOf<Int>(1, 1, 1, 3, 3 ,4)
number4.remove(1) // 쓴 값을 삭제한다
println(number4)
//println(number3)

// Map
val number5 = mapOf<Int, String>(1 to "one", 2 to "two")
println(number5.keys) // 키 값 가져오기
println(number5.values) // 값 가져오기
println(number5.size) // 크기 가져오기
println(number5[1]) // 키 값을 활용하여 값 가져오기
println(number5.get(2)) // 키 값을 활용하여 값 가져오기
println(number5.getOrDefault(1, "default")) // 키 값을 활용하여 값 가져오고 없으면 쓴 값 가져오기
println(number5.getOrDefault(3, "default")) // 키 값을 활용하여 값 가져오고 없으면 쓴 값 가져오기
println(number5.get(3)) // 값이 없으면 null을 가져온다
val number6 = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))
//println(number5)
//println(number6)
