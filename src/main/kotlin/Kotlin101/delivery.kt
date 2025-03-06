fun main () {
    val weight = readln().toInt()
    when{
        (weight<2) -> println("150 руб./км.")
        (weight < 5) -> println("200 руб./км.")
        (weight<12) -> println("250 руб./км.")
        (weight<18) -> println("300 руб./км.")
        (weight<30) -> println("350 руб./км.")
        (weight<200) -> println("1000 руб./км.")
        else -> { println("Для расчета стоимости свяжитесь с менеджером.")}

    }
}