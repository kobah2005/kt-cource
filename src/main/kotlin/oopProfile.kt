fun main(){
    val name= readln().toString()
    val age= readln().toInt()
    val first : Person =Person()
    val second : Person =Person()
    first.name=name
    first.age=age
    println(" ${first.name}  ${first.age}")
    println(" ${second.name}  ${second.age}")
}