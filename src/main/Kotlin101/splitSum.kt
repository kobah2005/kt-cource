fun main (){
    val numbers= readln().split(" ")
    var result =0
    for (i in numbers){
        result += i.toInt()
    }
    println(" $result")
}