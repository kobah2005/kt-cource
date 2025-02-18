import java.text.SimpleDateFormat
import java.util.*

class LogEvent(val eventData: Any) {
    val date: String = getCurrentDate()

    // вам понадобится этот метод чтобы получить текущую дату и время
    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return dateFormat.format(Date())
    }

    override fun toString(): String {
        return "[${date}]: ${eventData}"
    }
}

// Перечисление действий пользователя
enum class UserAction {
    LOGIN, LOGOUT, CLICK_BUTTON, VIEW_PAGE;

    override fun toString(): String {
        return "UserAction: ${this.name}"
    }
}
