fun main1 () {
     val names = listOf("one", "two","three")
     val sname = readln().toString()
     var nameFound =false
     //var index =0
    /*
    while (index<names.size){
        if (name == names[index]){
            nameFound=true
            break
        }
        index++
    }
    */
    for (name in names){
       println(name)
        if (sname == name){
            nameFound=true
            break
        }
    }

  println(" Name $sname  found $nameFound ")

    }

fun main(){
    val brands = listOf("Ford","Toyota","Mazda")
    val askedBrand = readln().toString()
    var isFound = false
    var index=0
    while (index< brands.size){
        if (askedBrand==brands[index]){
            isFound=true
            break
        }
        index++
        println(index)
    }
    println(isFound)
}