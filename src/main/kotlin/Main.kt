import accounts.CurrentAccount
import employees.Manager

fun main() {
    println("Welcome to Bitebank")



//    testResourcesBytebank()
//    TestEmployesResources()


}

private fun TestEmployesResources() {
    val mariel = Manager(name = "Mariel", cpf = "001", salary = 1045.0, senha = "1234")
    println("Name: ${mariel.name}")
    println("Cpf: ${mariel.cpf}")
    println("Salary: ${mariel.salary}")
    println("Bonus: ${mariel.bonus}")

    val manager = Manager(name = "Patricia", cpf = "005", salary = 5000.00, senha = "1234")
}

private fun testResourcesBytebank() {

    // Use labels for initialize objects is a goob practice
    val contaMariel = CurrentAccount(owner = "Mariel", numberAccount = 1001)
    println("Owner:  ${contaMariel.owner}")

    val contaJulia = CurrentAccount("julia", 1002)
    contaJulia.deposit(100.0)
    println("Balance account of Julia: ${contaJulia.balance}")

    println("Depositing 50 to Julia's account")
    contaJulia.deposit(50.0)
    println("Balance account of Julia: ${contaJulia.balance}")
}

