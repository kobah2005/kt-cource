package corporation

enum class OperationCode(val title:String) {
    EXIT("Выход"),
    REGISTER("Регистрация товара"),
    SHOW_ALL_ITEMS("Все карточки"),
    DELETE_ITEM("Удалить товар"),
    ADD_EMPLOYEE("Принять сотрудника"),
    LIST_EMPLOYEE("Печать списка сотрудников"),
    FIRE_EMPLOYEE("Уваолить сотрудника")
}