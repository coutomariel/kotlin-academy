package accounts

class CurrentAccount(
    owner: String,
    numberAccount: Int
) : Account(owner, numberAccount) {

    override fun withdraw(value: Double) {
        val currentValue = value + 0.10
        super.withdraw(currentValue)
    }

}