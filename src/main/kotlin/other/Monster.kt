import kotlin.random.Random

class Monster {
    val pawsCount: Int
    val eyesCount: Int
    val fangsCount: Int
    val clawsCount: Int
    val tentaclesCount: Int
    constructor(pawsCount: Int, eyesCount: Int, fangsCount: Int, clawsCount: Int, tentaclesCount: Int){
        this.pawsCount =  pawsCount
        this.eyesCount  = eyesCount
        this.fangsCount = fangsCount
        this.clawsCount = clawsCount
        this.tentaclesCount = tentaclesCount
    }
    constructor(size: Int): this(  size, size, size, size, size)
    constructor(): this(  Random.nextInt(1,10), Random.nextInt(1,10), Random.nextInt(1,10), Random.nextInt(1,10), Random.nextInt(1,10))

    fun printInfo(){
        println("Кол-во лап: ${pawsCount}\n" +
                "Кол-во глаз: ${eyesCount}\n" +
                "Кол-во клыков: ${fangsCount}\n" +
                "Кол-во когтей: ${clawsCount}\n" +
                "Кол-во щупалец: ${tentaclesCount}")
    }
}
fun task(){
    val query = readln().toString().split(" ")
    val creature =Monster(query[0].toInt(),query[1].toInt(),query[2].toInt(),query[3].toInt(),query[4].toInt())
    creature.printInfo()
}