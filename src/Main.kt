fun main(args: Array<String>) {
    val user1 = Google(id = "OKVMDFK", email = "mariorossi@libero.it")
    val user2 = Email(id = "xd0099")
    val user3 = Facebook(id = "ybb_44")
    user1.logIn(user1)
    user2.logIn(user2)
    user3.logIn(user3)
}
