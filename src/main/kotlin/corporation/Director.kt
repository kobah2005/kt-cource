package corporation

class Director(
    id:Int,
     name:String,
     age :Int =0
): Worker(id,name=name,age=age,Position.DIRECTOR)
{
    fun takeCoffe(assistant: Assistant)
    {
        val drink =assistant.bringCoffee()
        println("Thank ${assistant.name} the $drink was very tasty")
    }
    fun sentConsultantToWork(consultant: Consultant)
    {
    val count= consultant.serveClient()
    println("The consultant ${consultant.name} served  $count customers")
    }

    override fun work() {
        println("Im director $name " )

    }
}