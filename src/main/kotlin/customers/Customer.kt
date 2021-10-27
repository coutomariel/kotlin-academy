package customers

import employees.Autenticateable

class Customer(
    val name: String,
    val cpf: String,
    override val password: String
): Autenticateable