package corporation

class Assistant(
    name:String,
    age :Int =0
): Worker(name=name,age=age){
    fun bringCoffee(drinkName: String ="Cappuccino",count: Int=1):String  {
        repeat(count){
            println("$name is getting up")
            println("Go to Coffee machine")
            println("press the $drinkName button")
            println("wait when coffee to be prepered")
            println("Bring coffee to boss")
            println("Return to workplace")
        }
        return drinkName
    }

}