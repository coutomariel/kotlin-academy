package employees

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val senha: String
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
),
    Autenticavel {

    override val bonus: Double
        get() {
            return salary + salary * 0.1
        }


    override fun autentica(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
