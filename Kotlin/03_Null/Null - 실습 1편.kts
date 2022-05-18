val number : Int? = null // null이 들어갈 수 있는 변수 -> nullable 한다
//val number2 : Int = null // null이 들어갈 수 없는 변수 -> non - null

val num1 : Int = 2 + 5
val num2 : Int = 10
val num3 : Int = num1 + num2
println(num3)

var number2 : Int? = 2 + 5
var number3 : Int? = 10
val number4 : Int? = number2 + number3 // number2, number3 가 nullable 이므로 null이 들어올 수도 있으므로 연산이 안된다.
val number5 : Int? = number2!! + number3!! // 가능

println(number5)
// !!로 null이 아님을 개발자가 보장할 수 있다.
// - 하지만 실제로 null인 경우는 NPE(NullPointException)이 발생할 수 있다.
// - 결론 : 정말 100% 확신이 있는 경우가 아니면 !!은 사용하지말자




