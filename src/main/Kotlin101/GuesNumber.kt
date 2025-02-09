/*fun main()
{
    var number = readln().toInt()
    val mynum = Random.nextInt(100)
    while (number != mynum)
    {

        if (mynum > number) {
            println(" мое больше")
        } else if (mynum < number){
            println("мое меньше")
        }
        number = readln().toInt()
    }
    println("угадал, я загадал $number")

}
*/

fun main(){
val num= readln().toInt()
var sum:Int    =0
var index= 1
while (num>=index) {
    sum+= index
    //print("$index + ")
    index++

}
    println("Сумма чисел от 1 до ${num} равна $sum")
}