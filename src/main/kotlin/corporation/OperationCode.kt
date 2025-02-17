package corporation

enum class OperationCode(val title:String) {
    EXIT("Выход"),
    REGISTER("Регистрация товара"),
    SHOW_ALL_ITEMS("Все карточки"),
    DELETE_ITEM("Удалить товар"),
    ADD_EMPLOYEE("Принять сотрудника"),
    FIRE_EMPLOYEE("Уваолить сотрудника"),
    LIST_EMPLOYEE("печать списка сотрудников")
}