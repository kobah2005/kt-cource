package corporation

class Accountant(id:Int,name:String,age: Int): Worker(id, name,age, Position.ACCOUNTANT) {
    val items = mutableListOf<ProductCard>()
    override fun work() {
        val operations =OperationCode.entries
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
                OperationCode.REGISTER -> registerNewItem()
                OperationCode.SHOW_ALL_ITEMS -> showAllItems()
                OperationCode.DELETE_ITEM -> TODO()
                OperationCode.ADD_EMPLOYEE -> TODO()
                OperationCode.FIRE_EMPLOYEE -> TODO()
                OperationCode.LIST_EMPLOYEE -> TODO()
            }
        }
    }
    fun registerNewItem(){
        val productTypes =ProductType.entries
        print("Enter the product type.")
        for ((index,type) in  productTypes.withIndex()){
            print(" $index - ${type.title}")
            if (index< productTypes.size-1) {print(", ")}
            else{println(":")}
        }

        val prodTypeIndex= readln().toInt()
        val prodType= productTypes[prodTypeIndex]
        print("Enter the product name: ")
        val prodName= readln().toString()
        print("Enter the product Brand: ")
        val prodBrand= readln().toString()
        print("Enter the product price: ")
        val prodPrice= readln().toInt()
        val productCard= when(prodType){
            ProductType.FOOD -> {print("Enter the product caloric: ")
                val prodCalories= readln().toInt()
                Food(prodName,prodBrand,prodPrice,prodCalories)
            }
            ProductType.APPLIENCE -> {print("Enter the product wattage: ")
                val prodWattage= readln().toInt()
                Applience(prodName,prodBrand,prodPrice,prodWattage)
            }
            ProductType.SHOES ->  { print("Enter the product size: ")
                val prodSize= readln().toFloat()
                Shoes(prodName,prodBrand,prodPrice,prodSize)
            }
        }
        items.add(productCard)
    }
    fun showAllItems(){
        for (item in items){
            item.printInfo()
        }
    }
}