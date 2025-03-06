fun main (){
   /*val array = arrayOf(1,5,3,6,7)
    for (i in array) {
        println(i)
    }*/
 val arr = arrayOfNulls<Int?>(301)

 /*   for (i in 0..100){
        arr[i]=i
    }
    for (i in 0 until arr.size){
        println( arr[i])
    }
    //val arr2 = arrayOfNulls<Int?>(101)
    for ((index , i ) in arr.withIndex()){
        arr[index]=i?.times(2)
    }
    for(i in arr) {
        println(i)}*/

    for (i in 300..600){
        arr[i-300]=i
    }
    println(arr[0])
    println(arr[10])
    println(arr[300])
    for((index, i) in (300 downTo 0).withIndex()) {

        if (i % 5 ==0) {println(arr[index])
            println(i)}
    }

}