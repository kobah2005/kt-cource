package corporation

import java.io.File

class Accountant(id:Int,name:String,age: Int): Worker(id, name,age, Position.ACCOUNTANT) {
    //val items = mutableListOf<ProductCard>()
    val employersFile= File("Employeers.txt")
    val goodsFile=File("goods.txt")
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
                OperationCode.DELETE_ITEM -> removeItem()
                OperationCode.ADD_EMPLOYEE -> TODO()
                OperationCode.LIST_EMPLOYEE -> TODO()
                OperationCode.FIRE_EMPLOYEE -> TODO()
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
        goodsFile.appendText("${prodName}%${prodBrand}%${prodPrice}%")
        when(prodType){
            ProductType.FOOD -> {print("Enter the product caloric: ")
                val prodCalories= readln().toInt()
                goodsFile.appendText("${prodCalories}%")
            }
            ProductType.APPLIENCE -> {print("Enter the product wattage: ")
                val prodWattage= readln().toInt()
                goodsFile.appendText("${prodWattage}%")
            }
            ProductType.SHOES ->  { print("Enter the product size: ")
                val prodSize= readln().toFloat()
                goodsFile.appendText("${prodSize}%")
            }
       }
        goodsFile.appendText(" ${prodType.name}\n")
    }
    fun showAllItems(){
        for ((index,item) in readAllItems().withIndex()){
            print(index)
            item.printInfo()
        }
    }
    fun readAllItems():MutableList<ProductCard>{
        val result = mutableListOf<ProductCard>()
        val productsAsText =goodsFile.readText().trim().split("\n")
        if (productsAsText.isEmpty()) return result

        for (item in productsAsText){
            val card= item.split("%")
            val prodCartType = ProductType.valueOf(card[4])
            val product =  when(prodCartType){
                ProductType.FOOD ->Food(card[0],card[1],card[2].toInt(),card[3].toInt())
                ProductType.APPLIENCE -> Applience(card[0],card[1],card[2].toInt(),card[3].toInt())
                ProductType.SHOES -> Shoes(card[0],card[1],card[2].toInt(),card[3].toFloat())
            }
            result.add(product)
        }
        return result
    }

    fun removeItem(){
        println("Enter the removing Item index")
        val rmIndex=readln().toInt()
        val items=readAllItems()
        if (items.isEmpty()) return
        items.removeAt(rmIndex)
        goodsFile.writeText("")
        for (item in items){
            val productCard= when( item.type){
                ProductType.FOOD -> {
                    "${item.name}%${item.brand}%${item.price}%${(item as Food).caloreies}%FOOD"
                }
                ProductType.APPLIENCE -> {print("Enter the product wattage: ")
                    "${item.name}%${item.brand}%${item.price}%${(item as Applience).wattage}%APPLIENCE"
                }
                ProductType.SHOES ->  { print("Enter the product size: ")
                    "${item.name}%${item.brand}%${item.price}%${(item as Shoes).size}%SHOES"
                }
            }
            goodsFile.appendText(productCard)

        }
    }

}