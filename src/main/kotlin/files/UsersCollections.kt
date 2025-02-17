package files

import corporation.OperationCode

enum class commandCode {SHOW, ADD, REMOVE, REMOVE_AT}

fun task(listUser: List<String>) : List<String> {
    val users = mutableListOf<String>()
    users.addAll(listUser)
    val operation= readln().toString()
        when(operation){
            "SHOW"-> for(user in users){println(user)}
            "ADD"-> {val newUser=readln().toString()
                users.add(newUser)
                for(user in users){println(user)}
            }
            "REMOVE"-> {
                val rmUser= readln().toString()
                if(users.contains(rmUser)){users.remove(rmUser)}
                for(user in users){println(user)}

            }
            "REMOVE_AT"-> {
                val rmUser= readln().toInt()
                users.removeAt(rmUser)
                for(user in users){println(user)}
            }
            else->{println("Некорректное значение") }

        }

    return users
}
/* изящное решение
fun task(listUser: List<String>) {
    val mutableUsers = listUser.toMutableList()

    when (readln()) {
        "SHOW" -> {}
        "ADD" -> mutableUsers.add(readln())
        "REMOVE" -> mutableUsers.remove(readln())
        "REMOVE_AT" -> mutableUsers.removeAt(readln().toInt())
        else -> {
            println("Некорректное значение")
            return
        }
    }

    mutableUsers.forEach(::println)
}
 */