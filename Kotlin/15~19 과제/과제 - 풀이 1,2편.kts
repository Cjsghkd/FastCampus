open class Warrior constructor (hp : Int, var power : Int, var armor : Int) {

    var isAlive : Boolean = true
        get() {
            if (field == true) println("Warrior는 아직 살아있다. 체력 : ${this.hp}")
            else println("Warrior는 죽었습니다")
            return field
        }

    var hp : Int = 100
        set(value) {
            if (value <= 0) {
                field = 0
                this.isAlive = false
            } else field = value
        }

    var killCount : Int = 0

    init {
        this.hp = hp
    }

    fun attack(monster : Monster) {
        println("Warrior가 공격을 합니다")
        if (!monster.defense(this)) {
            // 몬스터 죽음
            this.killCount += 1
            println("몬스터를 처치했습니다. 현재 킬 카운트 : ${this.killCount}")
        }
    }

    fun defense(monster: Monster) : Boolean {
        val damege : Int = monster.power - this.armor
        this.hp -= if (damege > 0) damege else 0
        return this.isAlive
    }

//    fun levelUp() : Knight {
//
//    }

}

//class Knight : Warrior {
//
//}

class Monster constructor (hp : Int, var power : Int, var armor : Int) {

    var isAlive : Boolean = true
        get() {
            if (field == true) println("Monster는 아직 살아있다. 체력 : ${this.hp}")
            else println("Monster는 죽었습니다")
            return field
        }

    var hp : Int = 100
        set(value) {
            if (value <= 0) {
                field = 0
                this.isAlive = false
            } else field = value
        }

    init {
        this.hp = hp
    }

    fun bite(warrior: Warrior) {
        println("Monster가 공격을 합니다")
        warrior.defense(this)
    }

    fun defense(warrior : Warrior) : Boolean {
        val damege : Int = warrior.power - this.armor
        this.hp -= if (damege > 0) damege else 0
        return this.isAlive

//        if (this.hp > 0) {
//            // 살아있다
//        } else {
//            // 죽어있다
//        }
    }
}

val warrior = Warrior(100, 10, 10)
val monster = Monster(20, 5, 1)

warrior.attack(monster)
warrior.attack(monster)
warrior.attack(monster)