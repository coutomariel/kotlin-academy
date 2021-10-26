fun main() {
    println("Bem vindo ao bytebank!")

    /**
     * - Enviroments given define like val or var
     * - Support typed assignement for inference, however allow force typed assignement
     */

    val owner = "Mariel" //val owner: String = "Mariel"
    val accountNumber = 10000 // val accountNumber: Int = 10000
    var balance = 100.00 //var balance: Double = 0.00
    balance += 20

    /**
     * Support to use template strings
     */
    println("\nOwner: $owner") //println("Titular:" + titular)
    println("Account: $accountNumber")
    println("Balance: $balance")

//    testConditionalsOne(balance)
//    testConditionalsTwo(balance)
//    repeatedPrintPhraseUsingFor("Yes, we can because i believe.")
    repeatedPrintPhraseUsingWhile("Yes, we can. Using while for five iterations")


}

/**
 * Flow control using if, else if or else
 */

fun testConditionalsOne(balance: Double) {
    if (balance > 0.00) {
        println("Is positive balance account")
    } else if (balance == 0.00) {
        println("Is neutral balance account")
    } else {
        println("Account is negative")
    }
}

/**
 * Flow control with when expression
 */
fun testConditionalsTwo(balance: Double) {
    when {
        balance > 0.00 -> println("Is positive balance account")
        balance == 0.00 -> println("Is neutral balance account")
        else -> println("Is neutral balance account")
    }
}

/**
 * Use loops in kotlin
 */
fun repeatedPrintPhraseUsingFor(phrase : String){
    for(i in 5 downTo  1){ // for(i in 1..5){
        println(phrase)
    }
}

fun repeatedPrintPhraseUsingWhile(phrase : String){
    var iterator = 0
    while (iterator < 5){
        println(phrase)
        iterator++
    }
}
