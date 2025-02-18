package corporation

open class ProductCard(
    val name:String,
    val brand: String,
    val price: Int,
    val type: ProductType)
{
    open fun printInfo(){
        print("product name: $name Brand: $brand  price: $price")
    }
}

class Shoes(
    name: String,
    brand: String,
    price: Int,
    val size: Float)
    : ProductCard(name=name, brand=brand, price=price,ProductType.SHOES){
    override fun printInfo() {
        super.printInfo()
        println(" Size: $size")
    }
}

class Food(
    name: String,
    brand: String,
    price: Int,
    val caloreies: Int)
    : ProductCard(name=name, brand=brand, price=price,ProductType.FOOD){
    override fun printInfo() {
        super.printInfo()
        println(" Size: $caloreies")
    }
}

class Applience(
    name: String,
    brand: String,
    price: Int,
    val wattage: Int)
    : ProductCard(name=name, brand=brand, price=price,ProductType.APPLIENCE){
    override fun printInfo() {
        super.printInfo()
        println(" Power: $wattage")
    }
}