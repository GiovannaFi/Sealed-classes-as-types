sealed class User {
    fun logIn(user: User) = when (user) {
        is Email -> println("Email id ${user.id}, ${user.email ?: "no emain found"}")
        is Facebook -> println("Facebook id ${user.id}, ${user.email ?: "no email found"}")
        is Google -> println("Google id ${user.id}, ${user.email ?: "no email found"}")
        else -> println("Error")
    }
}
