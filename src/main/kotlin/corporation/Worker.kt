package corporation

import java.text.FieldPosition

open class Worker(
    val id: Int,
    val name: String,
    val age:Int=0,
    val position: Position
    ){
    open fun work(){
        println("I'm working now.")
    }
    fun printInfo(){
        println("Id: ${this.id} Name: ${this.name} Age: ${this.age} Position: ${this.position}")
    }
}