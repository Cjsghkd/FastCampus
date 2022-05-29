// 기본자료형의 타입 캐스팅
val number : Int = 10
val numberString : String = number.toString()
println(numberString)

val stringNumber : Int = numberString.toInt()
println(stringNumber)

val numberF : Double = 10.5
val numberFString : String = numberF.toString()
val numberFInt : Int = numberF.toInt()
println(numberFInt)
// -> to타입이 오는 함수를 이용해서 형변환을 한다

// 상속한 클래스간의 캐스팅
open class Warrior1(var name : String,var power : Int, var type : String) {  // 부모클래스, 슈퍼클래스
    open fun attack() {
        println("복잡한 코드 + 공격")
    }
}

class DenfenseWarrior1 constructor (name : String, power : Int) : Warrior1(name = name,power = power, "고블린") {
    fun defense() {
        println("방어")
    }
}

// is
// - 타입 체크
// - true, false가 리턴된다
// - 스마트 캐스팅을 해준다
// - var은 불가능 -> val을 사용해야한다
val warrior : Warrior1 = DenfenseWarrior1("방어형 전사", 100)
// -> DenfenseWarrior1을 만들었지만 warrior 가 Warrior1 타입이므로 DenfenseWarrior1의 함수인 defense()를 버리고 만들어 졌기 때문에 defense 함수가 사용 불가능이다
// warrior.defesen()
println(warrior.attack())

if (warrior is DenfenseWarrior1) {
    // 스마트 캐스팅
    // -> 내가 만든 warrior를 if 블럭 안에서는 denfernseWarrior1으로 사용가능하다
    warrior.defense()
}

// as
// - 지정한 타입으로 캐스팅을 시도하고, 불가능한 경우에는 에외 발생
val warrior1 : DenfenseWarrior1 = warrior as DenfenseWarrior1
// val warrior2 : DenfenseWarrior1 = 10 as DenfenseWarrior1 -> 에외 발생
warrior1.defense()

// as?