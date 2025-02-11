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
)

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
):PowerTool(brand,model,power, weight, cableLength, price, voltage)

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
):PowerTool(brand,model,power, weight, cableLength, price, voltage)

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
): PowerTool(brand,model,power, weight, cableLength, price, voltage)