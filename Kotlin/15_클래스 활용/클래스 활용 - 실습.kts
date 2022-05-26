// 자료형
// -> Int, Byte, Short, Long ...
// -> Class도 자료형(타입)이 될 수 있다

class Bank() {
    fun save(account : Account, money : Int) {
        if (money >= 0) account.balance += money
        else println("마이너스 금액은 예금할 수 없습니다")
    }
    fun withdraw(account : Account, money : Int) {
        if (account.chcekBalance() >= money) account.balance -= money
        // if (account.balance >= money) account.balance -= money -> 이것도 가능합니다
        else println("잔액이 부족합니다")
    }
}

class Account constructor(
    val initialBalance : Int = 0
) {
    var balance : Int = 0

    init {
        this.balance = initialBalance
    }

    fun chcekBalance() : Int {
        return balance
    }
}

val account = Account(1000)
val bank = Bank()
println(account.chcekBalance())
bank.save(account, 1000)
println(account.chcekBalance())
bank.withdraw(account, 2000)
println(account.chcekBalance())
bank.withdraw(account, 1000)
bank.save(account, -1000)

val account_B = Account(10000)
bank.save(account_B, 1000)
println(account_B.chcekBalance())
