package employees

interface Autenticateable {
    val password : String
    fun autenticate(password: String): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }
}