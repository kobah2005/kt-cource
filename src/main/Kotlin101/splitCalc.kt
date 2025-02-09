fun main (){
    val equation= readln().toString()
    val sepEq =equation.split(' ')
    val firstNum =sepEq[0].toDouble()
    val SecondNum =sepEq[2].toDouble()
    val action = sepEq[1]
    var result = when (action){
        '+'.toString() -> firstNum + SecondNum
        '-'.toString() -> firstNum - SecondNum
        '*'.toString() -> firstNum * SecondNum
        '/'.toString() -> firstNum / SecondNum
        else -> 0.0
    }
    println("$firstNum $action $SecondNum = $result")
}