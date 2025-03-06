fun main() {
    val password = readln().toCharArray()
    if (password.contains('Ъ')) {
        println("У вас идеальный пароль!")
    } else println("Опс! В вашем пароле кое-чего не хватает.")
}
