class Car {
    val brand :String
    val model:String
    val enginePower:Int
    val bodyColor:String


    constructor(brand: String , model: String, enginePower : Int , bodyColor: String)
    {
        this.brand = brand
        this.model = model
        this.enginePower = enginePower
        this.bodyColor = bodyColor
    }
    fun printInfo(){
        println("$brand $model $enginePower л.с. $bodyColor")
    }
    fun drive() {
        // измените метод
        if (this.enginePower >= 120) println("Еду быстро, но недалеко на ${this.brand} ${this.model}")
        else println("Еду далеко, но небыстро на ${this.brand} ${this.model}")
    }
    fun refuel(gStationName:String,gBrand: String, qtLiters: Int ) {
        println("Произведена заправка на АЗС \"$gStationName\"\n" +
                "Марка бензина: $gBrand\n" +
                "Кол-во литров: $qtLiters")
    }
}

fun Cartask() {
    val auto = readln().toString().split(" ")
    var myCar = Car(auto[0] ,auto[1], auto[2].toInt(), auto[3])
    myCar.printInfo()
    //создайте здесь экземпляр Car и вызовите у него метод refuel()
}

//fun task2() {
//    val car= Car()
//    val fuel= readln().toString().split(" ")
//    car.refuel(fuel[0], fuel[1], fuel[2].toInt())
//    //создайте здесь экземпляр Car и вызовите у него метод refuel()
//}

/*
Добавьте в этот класс метод refuel() (заправиться), который принимает в качестве параметра название АЗС (String), марку бензина (String), и кол-во литров (Int), которое нужно заправить. Метод выводит в консоль:

Произведена заправка на АЗС "{НАЗВАНИЕ_АЗС}"
Марка бензина: {МАРКА}
Кол-во литров: {КОЛИЧЕСТВО}
 */
/*
Пусть метод выводит в консоль надпись:
Еду быстро, но недалеко на {марка} {модель}  если мощность автомобиля >= 120л.с.
Еду далеко, но небыстро на {марка} {модель}  если мощность автомобиля < 120л.с.
 */
//fun task1() {
//    //создайте здесь экземпляр Car и вызовите у него методы init() и drive()
//    val auto = readln().toString().split(" ")
//    var myCar = Car()
//    myCar.init(auto[0] ,auto[1], auto[2].toInt(), auto[3])
//    myCar.drive()
//}