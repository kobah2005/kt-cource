package files

import java.io.File

fun main() {
    val file = File("toDoList.md")

        val operations = OperationCode.entries
        while(true){
            print("Enter the operation type. ")
            for((index,opcode) in operations.withIndex() ){
                print("$index - ${opcode.title}")
                if (index< operations.size-1) {print(", ")}
                else{println(": ")}
            }
            val operationIndex= readln().toInt()
            val operation =operations[operationIndex]

            when(operation){
                OperationCode.EXIT -> break
                OperationCode.REGISTER -> {
                    println("Введите задачу")
                    val task = readln().toString()
                    file.appendText("# $task \n")
                }
                OperationCode.SHOW_ALL_ITEMS -> {
                    val tasks=file.readText().trim().split("\n")
                    for ((index,item) in tasks.withIndex()){
                        println("$index $item")
                    }
                }
            }
        }

}


