fun main() {
    println("Welcome to Bitebank")

    // Use labels for initialize objects is a goob practice
    val contaMariel = Account(owner = "Mariel", numberAccount = 1001)
    println("Owner:  ${contaMariel.owner}")

    val contaJulia = Account("julia", 1002)
    contaJulia.deposit(100.0)
    println("Balance account of Julia: ${contaJulia.balance}")

    /**
     * Transfer implementation
     */
    println("Depositing 50 to Julia's account")
    contaJulia.deposit(50.0)
    println("Balance account of Julia: ${contaJulia.balance}")

//    println("try withdraw to 160 to Julia's account")
//    contaJulia.withdraw(160.0)
//    println("Balance account of Julia: ${contaJulia.balance}")

}

class Account(val owner: String, val numberAccount: Int) {
    /**
     * Using properties for implements getters and setters
     */
    var balance = 0.00
        private set

    /**
     * Using primary contructor for required properties
     */
//    var owner = ""
//    var numberAccount = 0
//
//    constructor(owner : String, numbeAccount: Int) {
//        this.owner = owner
//        this.numberAccount = numbeAccount
//    }

    fun deposit(value: Double) {
        this.balance += value
    }

    fun withdraw(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        } else {
            throw RuntimeException("Impossible withdraw, this account without balance")
        }
    }

    fun trasfer(value: Double, destination: Account) {
        if (this.balance >= value) {
            this.withdraw(value)
            destination.deposit(value)
        }
    }


//    fun getBalance(): Double {
//        return this.balance
//    }
//
//    fun setBalance(balance: Double) {
//        if (balance > 0) {
//            this.balance = balance
//        }
//    }

}