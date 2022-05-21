// 배열을 선언하는 방법 (1)
var array1 = arrayOf(true, "Hi", 10, 2.2, null)
var array2 = arrayOf<Int?>(1, 2, 3, 4, 5, null)
var array3 = intArrayOf(1, 2, 3, 4, 5)

// 배열을 선언나는 방법 (2)
var array4 = Array(10, {0})
println(array4[0])
println(array4[2])
println(array4[4])
println(array4[6])
var array5 = IntArray(10,{0})
// var array6 = StingArray(10, {"Hi"}) -> 불가능