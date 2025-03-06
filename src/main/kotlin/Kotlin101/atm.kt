/*
Пользователь вводит сумму для снятия в долларах - Sample Input
Программа вычисляет сколько и какого номинала нужно выдать купюры.
Вывести в консоль результат в формате Sample Output
Дополнительная информация:

Доступный номинал купюр - 100, 50, 20, 10, 5, 2, 1
Необходимо максимально использовать более крупный номинал, т.е. при запросе 120 долларов выдавать не 6 купюр по 20  а купюру 100 - 1шт., купюру 20  - 1шт.
Подсказка насчет форматирования строки (ВАЖНО):
Если вам нужно, чтобы в строке между переменной и следующей частью строки не было пробела, то можно использовать фигурные скобки:

Например, есть переменная count и вам нужно вывести строчку  "У вас 5шт." Тогда вы можете попробовать сделать так "У вас $countшт." - но тогда будет ошибка, в этом случае вы можете переменную обернуть в фигурные скобки: "У вас ${count}шт."
*/

fun main(){
    val amount = readln().toInt()

    val q100 = amount / 100
    var restAmount = amount - q100* 100
    val q50 = (amount % 100) /50
    restAmount= restAmount - q50 *50
    val q20 = restAmount / 20
    val q10 = (((amount % 100)  % 50) % 20) / 10
    val q5 = ((((amount % 100)  % 50) % 20) % 10) / 5
    val q2 = (((((amount % 100)  % 50) % 20) % 10) % 5) / 2
    val q1 = (((((amount % 100)  % 50) % 20) % 10) % 5) % 2
    val result ="""
        Вам доступно:
        100$ - ${q100}шт
        50$ - ${q50}шт
        20$ - ${q20}шт
        10$ - ${q10}шт
        5$ - ${q5}шт
        2$ - ${q2}шт
        1$ - ${q1}шт
    """.trimIndent()
    println(result)
}