open class Warrior constructor (var HP : Int, var power : Int, var armor : Int) {
    fun attack(monster : Monster) {
        println("Warrior가 공격을 합니다")
        monster.defense(this)
    }

    fun defense() {

    }

    fun levelUp() : Knight {

    }

}

class Knight : Warrior {

}

class Monster constructor (HP : Int, var power : Int, var armor : Int) {

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
        this.hp = HP
    }

    fun attack(monster : Monster) {
        println("Warrior가 공격을 합니다")
    }

    fun defense(warrior : Warrior) : Boolean {
        val damege : Int = warrior.power - this.armor
        this.HP -= if (damege > 0) damege else 0

        if (this.HP > 0) {
            // 살아있다
        } else {
            // 죽어있다
        }
    }
}