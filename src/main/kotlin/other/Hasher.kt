class UserRegistrationService {
    private val registeredUsers = mutableListOf<String>()
    val phasher =PasswordHasher()
    // Метод для валидации данных пользователя
    fun validateUserData(username: String, password: String): Boolean {
        return username.isNotBlank() && password.length >= 8
    }

    // Метод для сохранения данных пользователя
    fun saveUser(username: String, passwordHash: String) {
        registeredUsers.add("$username:$passwordHash")
    }

    // Метод для регистрации пользователя
    fun registerUser(username: String, password: String): Boolean {
        if (!validateUserData(username, password)) {
            println("Invalid user data")
            return false
        }

        val passwordHash = phasher.hashPassword(password)
        saveUser(username, passwordHash)
        println("User registered successfully")
        return true
    }
}

class PasswordHasher(){
    fun hashPassword(password: String): String {
        return password.reversed() // Простая симуляция хеширования (не использовать в продакшене)
    }
}


class TextMerger {
    fun mergeText(lines: List<String>): String {
        var result = StringBuilder()
        for (line in lines) {
            result.append( line + "\n" ) // Неэффективная конкатенация строк
        }
        return result.toString()
    }
}