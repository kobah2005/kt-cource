/*
    fun main(){
        val a = mutableListOf(1, 5, 6, 8, 9, 101, 12)
        for ((index, i) in a.withIndex())   {
         a[index] = i * 2
     }
    }
*/
var name: String? = "Sergey"

fun main() {
    if (!name.isNullOrEmpty()) {
        if (name!!.length > 5) {
            println("Больше 5-ти")
        } else {
            println("Меньше 5-ти")
        }
    }
}