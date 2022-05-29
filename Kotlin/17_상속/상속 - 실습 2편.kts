// 오버로딩

class Sum() {
    fun sum() : Int {
        return 10
    }

//    fun sum() : Int {
//        return 20        -> 에러
//    }

    fun sum(number1 : Int) : Int {
        return number1 + 10
    }

    fun sum(number1 : Int, number2 : Int) : Int {
        return number1 + number2 + 10
    }
}

val sum = Sum()
println(sum.sum())
println(sum.sum(10))
println(sum.sum(10, 20))

// 오버라이딩
open class Warrior1(var name : String,var power : Int, var type : String) {  // 부모클래스, 슈퍼클래스
    open fun attack() {
        println("복잡한 코드 + 공격")
    }

    open fun getDenfensePower() : Int {
        return 10
    }
}

class DenfenseWarrior1 constructor (name : String, power : Int) : Warrior1(name = name,power = power, "고블린") {
    fun defense() {
        println("방어")
    }

    override fun attack() {
//      super.attack() // 슈퍼 클래스의 attack 함수
        println("간단한 코드 + 공격")
    }

    override fun getDenfensePower(): Int {
//      return super.getDenfensePower()
//      return 15  ->  되지만 이것 보다는 밑의 코드가 좋다
        val denfenseWarriorDenfensePower : Int = super.getDenfensPower()
        return denfenseWarriorDenfensePower + 5
    }
}

val denfenseWarrior = DenfenseWarrior1("홍길동", 100)
denfenseWarrior.attack()
// denfenseWarrior.super.attack() -> 오버라이딩으로 덮어썼기 때문에 불러 올수 없다