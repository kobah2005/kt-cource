import kotlin.math.round
import kotlin.math.PI
abstract class Shape (val name: String){
    abstract fun area(): Double
    abstract fun perimeter(): Double
    protected fun roundToTwoDecimals(value: Double): Double {
        return   round(value * 100) / 100
    }
}

class Circle(val radius: Double) : Shape("Круг") {
    override fun area(): Double {return roundToTwoDecimals(PI  * radius* radius)}
    override fun perimeter(): Double {return roundToTwoDecimals(2 * PI  * radius)}
}

class Rectangle (val width: Double, val height: Double): Shape("Прямоугольник") {
    override fun area(): Double {return roundToTwoDecimals(width * height)}
    override fun perimeter(): Double {return roundToTwoDecimals(2 * (width + height))}
}