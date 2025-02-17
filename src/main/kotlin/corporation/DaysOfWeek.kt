package corporation

enum class DaysOfWeek(val title:String) {
    SUNDAY("Воскресенье"),
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота")
}


fun maintask(){
    val days=DaysOfWeek.entries
    for (day in days){
        println(day.title)
    }
}






