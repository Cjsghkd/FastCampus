// ?
val number : Int = 10 // Non-nullable Int
val number : Int? = null // Nullable Int

// !!
val nullableNumberList : List<Int?> = listOf<Int?>(1, 2, 3, 4, 5)
var result : Int = 0
nullableNumberList.forEach {
    result += it!! // List에 null이 들어오면 에러 발생
}
// -> 정말 필요한 경우에만 사용을 해야한다

// ?. (safe call)
val text : String? = null
println(text?.length)
// println(text.length) // -> NullPointException이 발생 해야한다

// !!.
// println(text!!.length) -> 왠만하면 사용 X

// as?
open class Warrior1(var name : String,var power : Int, var type : String) {  // 부모클래스, 슈퍼클래스
    fun attack() {
        println("복잡한 코드 + 공격")
    }
}

class DenfenseWarrior1 constructor (name : String, power : Int)  {
    fun defense() {
        println("방어")
    }
}

val defenseWarrior = DenfenseWarrior1("", 100)
val warrior1 = defenseWarrior as? Warrior1
println(warrior1)

// ?: (엘비스 연산자)
val text2 : String = "123"
val nullText : String? = null

val len1 : Int if (text2 != null) text2.length else 0
val len2 : Int = text2?.length ?: 0