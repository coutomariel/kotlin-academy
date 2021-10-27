package employees

abstract class Employee(
    val name: String,
    val cpf: String,
    val salary: Double
) {
    abstract val bonus: Double
    

}