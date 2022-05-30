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

    open fun attack(monster : Monster) {
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

    fun levelUp() : Knight? {
        if (this.killCount > 5) {
            println("Knight로 레벨업!!")
            return Knight(this)
        } else {
            println("레벨업을 할 수 없습니다 현재 킬 카운트 : ${this.killCount}")
            return null
        }
    }

}

class Knight constructor (warrior: Warrior) : Warrior(warrior.hp, warrior.power, warrior.armor) {
    var energy : Int = 0

    init {
        this.hp = hp
        this.power = power + 2
        this.armor = armor + 1
    }

    override fun attack(monster: Monster) {
        super.attack(monster)
        this.energy += 1
    }

    fun hardAttack(monster: Monster) {
        if(monster.isAlive && this.energy >= 3) {
//            this.power += this.power + 30
//            monster.defense(warrior)
//            this.power = this.power -= 30
            monster.hp -= this.power + 30  // -> 좋은 방식은 아니다 (직접적으로 변수에 접근하는것 보단 함수로 접근 하는 것이 더 좋다 )
            this.energy -= 3
        } else println("에너지가 부족합니다. 에너지 : ${this.energy}")
    }
}

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