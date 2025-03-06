fun main() {
    val isHeavy = readln().toBoolean()
    val HP = readln().toInt()
    var taxRate: Int = 10
    val vType: String
    if (!isHeavy) {
        if (HP > 250) {
            taxRate = 150
        } else if (HP > 200) {
            taxRate = 75
        } else if (HP > 150) {
            taxRate = 49
        } else if (HP > 100) {
            taxRate = 34
        }
        vType= "легковой автомобиль"
    } else {
            taxRate = 25
            if (HP > 250) {
                taxRate = 85
            } else if (HP > 200) {
                taxRate = 65
            } else if (HP > 150) {
                taxRate = 50
            } else if (HP > 100) {
                taxRate = 40
            }
         vType= "грузовой автомобиль"
    }
        val tax = taxRate * HP
        val result = """
        Вид ТС: ${vType}
        Мощность двигателя: ${HP} л.с.
        Налоговая ставка: ${taxRate} руб./л.с.
        Сумма налога: ${tax} руб.
    """.trimIndent()

    println(result)
}