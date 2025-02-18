package corporation

class Assistant(
    id: Int,
    name:String,
    age :Int =0
): Worker(id=id, name=name,age=age,Position.ASSISTANT){
    fun bringCoffee(drinkName: String ="Cappuccino",count: Int=1):String  {
        repeat(count){
            println("$name is getting up")
            println("Go to Coffee machine")
            println("press the $drinkName button")
            println("wait when coffee to be prepared")
            println("Bring coffee to boss")
            println("Return to workplace")
        }
        return drinkName
    }

    override fun work() {
        println("Im  making coffee")
    }
}