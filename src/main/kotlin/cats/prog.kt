package cats

fun main(){
    val cat =Cat("Tom")
    println(cat.legsCount)
    cat.playWithMouse()
    val lion=Lion(3)
    println(lion.prideSize)
}