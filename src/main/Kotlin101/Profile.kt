/*fun main() {
/*    println("Enter name")
    val name=readln()
    println("Enter gender")
    val sex=readln()
    println("Enter age")
    val age=readln()
    println("Enter Height")
    val height =readln()
    println("Enter weight")
    val weight =readln()
    print("your name $name \n age: $age \n gaender: $sex \n" )*/

    println("Enter name")
    val name=readln()
    println("Enter Birthday")
    val bDate=readln()
    println("Enter bplace")
    val bplace=readln()
    println("Enter father")
    val father =readln()
    println("Enter mother")
    val mom =readln()
    println("Enter brother")
    val bro =readln()
    println("Enter wife")
    val wife =readln()
    print("Имя: $name \n Дата рождения: $bDate \n Место рождения: $bplace \n Отец: $father \n Мать: $mom \n Брат: $bro \n Жена: $wife" )
}*/


fun main() {
    val name = readln()
    val bDate = readln()
    val bplace = readln()
    val father = readln()
    val mom = readln()
    val bro = readln()
    val wife = readln()
    val result = """Имя: $name
Дата рождения: $bDate
Место рождения: $bplace
Отец: $father
Мать: $mom
Брат: $bro
Жена: $wife    
    """.trimIndent()
    print(result)
}
