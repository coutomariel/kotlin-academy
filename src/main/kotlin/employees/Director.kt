package employees

class Director(
    name: String,
    cpf: String,
    salary: Double,
    val senha: String,
    val plr: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
), Autenticavel {
    // Convert fun to properties
    override val bonus: Double
        get() {
            return salary * 1.1 + plr
        }

    override fun autentica(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}