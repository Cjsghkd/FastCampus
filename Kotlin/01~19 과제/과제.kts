open class Warrior(var hp : Int, var power : Int, var armor : Int) {

    var killMonster : Int = 0

    fun attack(monster : Monster) {
        println("Warrior가 공격합니다")
        monster.defense(this)
    }

    fun defense(monster : Monster) {
        val damege : Int = this.armor - monster.power
        this.hp -= damege
        if (this.hp > 0) println("Warrior가 아직 살아있다. 체력 : ${this.hp}")
        else println("Warrior가 죽었습니다.")
    }

    fun levelUp() : Boolean{
        if (this.killMonster > 5) return false
        else return true
    }
}

class Knight(warrior : Warrior) : Warrior(warrior.hp, warrior.power, warrior.armor) {
    var energy : Int = 10



//    init {
//        this.hp = warrior.hp
//        this.power = warrior.power
//        this.armor = warrior.armor
//    }

    fun hardAttack(monster : Monster) {
        if (energy >= 3) {
            power += 30
            monster.hp -= power
            power -= 30
        }
    }
}

class Monster(var hp : Int, var power : Int, var armor : Int) {

    fun bite(warrior : Warrior) {
        println("Monster가 공격합니다")
        warrior.defense(this)
    }

    fun defense(warrior : Warrior) {
        val damege : Int = this.armor - warrior.power
        this.hp += if (damge < 0) (damege = -damege)
        if (this.hp > 0) println("Monster가 아직 살아있다. 체력 : ${this.hp}")
        else {
            println("Monster가 죽었습니다.")
            warrior.killMonster += 1
        }
    }
}

val warrior = Warrior(100, 20, 10)
loop@ while (warrior.levelUp()) {
    val monster = Monster(20, 5, 1)
    while (monster.hp <= 0) {
        warrior.attack(monster)
        monster.bite(warrior)
        println("kill count : ${warrior.killMonster}")
        if (warrior.hp <= 0) break@loop
    }
}

//val knight : Knight = warrior.levelUp()