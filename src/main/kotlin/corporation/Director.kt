package corporation

class Director(
     name:String,
     age :Int =0
): Worker(name=name,age=age)
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
}