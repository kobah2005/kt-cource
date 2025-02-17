package corporation

class Price(
    val purchasePrice:Int,
    val retailPrice:Int,
    val wholesalePrice:Int
    )

open class PowerTool(
val brand: String,
val model: String,
val power: Int,
val weight: Double,
val cableLength: Int,
val price: Price,
val voltage: Int =220
){
    open fun turnOn(){

    }
}

class Drill(
    brand: String,
    model: String,
    power: Int,
    weight: Double,
    cableLength: Int,
    price: Price,
    voltage: Int =220,
    val drillChuckDiameter: Int,
    val minRotationSpeed: Int,
    val maxRotationSpeed: Int
):PowerTool(brand,model,power, weight, cableLength, price, voltage){
    override fun turnOn() {
        println("Дрель сверлит")
    }
}

class AngleGrinder (
    brand: String,
    model: String,
    power: Int,
    weight: Double,
    cableLength: Int,
    price: Price,
    voltage: Int =220,
    val discDiameter: Int,
    val isSmoothStart: Boolean,
    val isDustProtection: Boolean
):PowerTool(brand,model,power, weight, cableLength, price, voltage){
    override fun turnOn() {
        println("УШМ режет")
    }
}

class ChainSaw  (
    brand: String,
    model: String,
    power: Int,
    weight: Double,
    cableLength: Int,
    price: Price,
    voltage: Int =220,
    val chainSawTireLength: Int,
    val chainLinksCount: Int,
    val chainStep: Double
): PowerTool(brand,model,power, weight, cableLength, price, voltage){
    override fun turnOn() {
        println("Цепная пила пилит")
    }
}

/*fun task (){
    val drill =Drill()
}
*/
/*
open class PowerTool(
    val brand: String,
    val model: String
) {
  open  fun turnOn() {
        println("Электроинструмент включен")
    }
}

class Drill(
    brand: String,
    model: String,
    val drillChuckDiameter: Int
): PowerTool(brand, model) {
    override fun turnOn() {
        println("Дрель сверлит")
    }
    //переопределить метод turnOn()
}

class AngleGrinder(
    brand: String,
    model: String,
    val discDiameter: Int
): PowerTool(brand, model) {
    //переопределить метод turnOn()
     override fun turnOn() {
        println("УШМ режет")
    }
}

class ChainSaw(
    brand: String,
    model: String,
    val chainSawTireLength: Int
): PowerTool(brand, model) {
    override fun turnOn() {
        println("Цепная пила пилит")
    }
    //переопределить метод turnOn()
}

fun task() {
    // создайте здесь коллекцию инструментов и в цикле вызовите у них метод turnOn()
    val drill: Drill = Drill("","",1)
    val angleGrinder: AngleGrinder = AngleGrinder("","",2)
    val chainSaw: ChainSaw = ChainSaw("","",3)

    val powerTools: List<PowerTool> =listOf(drill,angleGrinder,chainSaw)

    for(tool in powerTools ){
    tool.turnOn()}
}
 */