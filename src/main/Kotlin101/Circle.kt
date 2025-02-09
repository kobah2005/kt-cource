fun main() {
    val radius = readln().toDouble()
    val pi = 3.14
    val L = 2 * pi * radius
    val C =  pi * radius * radius
    val res = """
        Радиус: $radius
        Длина окружности: $L
        Площадь круга: $C
    """.trimIndent()
    println(res)
}