class  Car2 {
    var brand = ""
    var model = ""
    var enginePower = 0
    var bodyColor = ""

    // добавьте метод init()

    fun init (brand: String , model: String, enginePower : Int, bodyColor: String)
    {
        this.brand = brand
        this.model = model
        this.enginePower = enginePower
        this.bodyColor = bodyColor
    }
    fun drive() {
        // измените метод
       if (this.enginePower >= 120) println("Еду быстро, но недалеко на ${this.brand} ${this.model}")
        else println("Еду далеко, но небыстро на ${this.brand} ${this.model}")
    }
}
/*
Пусть метод выводит в консоль надпись:
Еду быстро, но недалеко на {марка} {модель}  если мощность автомобиля >= 120л.с.
Еду далеко, но небыстро на {марка} {модель}  если мощность автомобиля < 120л.с.
 */
fun task3() {
    //создайте здесь экземпляр Car и вызовите у него методы init() и drive()
    val auto = readln().toString().split(" ")
    var myCar = Car2()
    myCar.init(auto[0] ,auto[1], auto[2].toInt(), auto[3])
    myCar.drive()
}