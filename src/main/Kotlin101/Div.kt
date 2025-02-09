fun main(){
//    val a=10
//    val b=3
//    val res=a / b
//    println(" $res " +a%b )
    val qwa= readln().toInt()
    val hour=qwa/3600
    val min=(qwa % 3600)/60
    val sec= qwa%60
    println("$hour :$min :$sec")
}