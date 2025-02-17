package corporation

import kotlin.random.Random
class Consultant(
    id: Int,
    name:String,
    age :Int = 0
): Worker(id,name=name,age=age,Position.CONSULTANT) {
fun syaHello() {
    print("Hello may name is ${name} ")
    if(age>0){ print("Im $age years old \n")}
    else {println("")}
}

    override fun work() {
        println("Im Consultant and im serving the client now.")
    }
fun serveClient():Int  {
    val count =Random.nextInt(1,100)
    repeat(count){
    println("Client was served")
   }
    return count
}

}