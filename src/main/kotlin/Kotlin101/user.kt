//// Примерный класс с правильной реализацией equals и hashCode с несколькими полями
//class Customer(val customerId: Int, val name: String, val email: String, val address: String) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (other !is Customer) return false
//        return customerId == other.customerId &&
//                email == other.email &&
//                address == other.address
//    }
//
//    override fun hashCode(): Int {
//        var result = customerId
//        result = 31 * result + email.hashCode()
//        result = 31 * result + address.hashCode()
//        return result
//    }
//}
//
//// Класс User - переопределите методы equals и hashCode по userId
//class User(val userId: Int, val name: String, val email: String) {
//    // Переопределите equals и hashCode здесь
//    override fun equals(other: Any?): Boolean {
//        if (other !is User) return false
//        return userId==(other as User).userId
//    }
//
//    override fun hashCode(): Int {
//        var result = userId
//        result = 31 * result + name.hashCode()
//        result = 31 * result + email.hashCode()
//        return result
//    }
//
//}
//
//// Класс Account - переопределите методы equals и hashCode по accountId и email
//class Account(val accountId: String, val userId: Int, val email: String) {
//    // Переопределите equals и hashCode здесь
//    override fun equals(other: Any?): Boolean {
//        if (other !is Account) return false
//        return accountId==(other as Account).accountId && email==other.email
//    }
//
//    override fun hashCode(): Int {
//        var result = accountId.hashCode()
//        result = 31 * result + userId
//        result = 31 * result + email.hashCode()
//        return result
//    }
//}