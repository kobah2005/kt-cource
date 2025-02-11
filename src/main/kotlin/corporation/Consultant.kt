package corporation

import kotlin.random.Random
class Consultant(
    name:String,
    age :Int = 0
): Worker(name=name,age=age) {
fun syaHello() {
    print("Hello may name is ${name} ")
    if(age>0){ print("Im $age years old \n")}
    else {println("")}
}
fun serveClient():Int  {
    val count =Random.nextInt(1,100)
    repeat(count){
    println("Client was served")
   }
    return count
}

}