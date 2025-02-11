package corporation

fun main(){
    val secretery= Assistant("Hellen",)
    val boss = Director("Nick",10)
    boss.takeCoffe(secretery)
    val worker= Consultant("Pit",9)
    worker.syaHello()
    boss.sentConsultantToWork(worker)

}