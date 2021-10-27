package accounts

abstract class Account(val owner: String, val numberAccount: Int) {
    var balance = 0.00
        private set

    fun deposit(value: Double) {
        this.balance += value
    }

    open fun withdraw(value: Double) {
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

}