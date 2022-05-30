class Monster(HP : Int, Attack : Int, Gard : Int) {
    var monsterHp : Int
    var monsterAttack : Int
    var monsterGard : Int

    init {
        this.monsterHp = HP
        this.monsterAttack = Attack
        this.monsterGard = Gard
    }

    fun attack() : Int {
        return monsterAttack
    }

    fun receiveDamage(warrior: Warrior) {
        monsterHp -= warrior.attack()
        if (monsterHp <= 0) {
            println("몬스터가 죽었습니다")
            warrior.monsterKill += 1
            warrior.killCheck()
        } else {
            println("몬스터가 아직 살아 있습니다. 체력 : ${monsterHp}")
        }
    }
}

open class Warrior(HP : Int, Attack : Int, Gard : Int) {
    var warriorHp : Int
    var warriorAttack : Int
    var warriorGard : Int
    var monsterKill : Int = 0

    init {
        this.warriorHp = HP
        this.warriorAttack = Attack
        this.warriorGard = Gard
    }

    fun attack() : Int {
        return warriorAttack
    }

    fun receiveDamage() {

        if (warriorHp <= 0) {
            println("전사는 죽었습니다")
        } else {
            println("전사는 아직 살아 있습니다. 체력 : ${warriorHp}")
        }

    }

    fun killCheck() {
        when {
//            monsterKill >= 3 -> levelUp()
        }
    }

//    fun levelUp(): Kinght = Kinght(warriorHp, warriorAttack, warriorGard)
}

class Kinght() : Warrior(100, 100, 100) {
    var energy : Int = 10

    fun hardAttack()  : Int {
        if (energy < 3) {
            println("에너지가 모자랍니다")
        } else {
            energy -= 3
            println("공격성공")
        }
        return warriorAttack + 10
    }
}

var warrior : Warrior = Kinght()
val kinght : Kinght = warrior as Kinght


//    kinght.hardAttack()




