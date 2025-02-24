package corporation

data class Order(
    val id: Int,
    val status: String,
    val type: String
)

fun removeCompletedOrders(orders: List<Order>, typeToRemove: String): List<Order> {
    // напишите здесь ваше решение
    val ordersList: MutableList<Order> = orders.toMutableList()
    var newOrdersList = mutableListOf<Order>()
    for ((index, order) in ordersList.withIndex()) {
        if (order.status == "completed" && order.type == typeToRemove) {
        } else {
            newOrdersList.add(order)
        }
        return newOrdersList.toList()
    }
    return newOrdersList.toList()
}
/*

data class Order(
    val id: Int,
    val status: String,
    val type: String
)


fun removeCompletedOrders(orders: List<Order>, typeToRemove: String): List<Order> {
    // напишите здесь ваше решение
    val ordersList: MutableList<Order> = orders.toMutableList()
    for ((index, order) in ordersList.withIndex()){
        if (order.status=="completed" && order.type==typeToRemove){
            ordersList.removeAt(index)}
    }
    return ordersList.toList()
}
 */