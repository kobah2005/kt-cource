fun main(){
    val name= readln().toString()
    val age= readln().toInt()
    val first : Persons =Persons()
    val second : Persons =Persons()
    first.name=name
    first.age=age
    println(" ${first.name}  ${first.age}")
    println(" ${second.name}  ${second.age}")
}