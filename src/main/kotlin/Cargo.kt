/*Создайте класс DeliveryObject (объект доставки), представляющий собой груз, который клиент передает в отдел доставки. В первичном конструкторе объявите поля:
length: Int - длина

width: Int  - ширина

height: Int  - высота

weight: Double - вес

Создайте класс Pack (упаковка). Он будет представлять коробки, в которые мы упакуем груз перед отправкой. В первичном конструкторе объявите поля:
length: Int - длина

width: Int  - ширина

height: Int  - высота

type: String  - тип упаковки со значением по-умолчанию "Картонная коробка"

weight: Double - вес

Создайте класс Cargo (груз), представляющий собой упакованный груз, готовый к отправке. В первичном конструкторе объявите поля:
length: Int - длина

width: Int  - ширина

height: Int  - высота

typePackaging: String  - тип упаковки

netWeight: Double - вес нетто (вес груза без упаковки)

grossWeight: Double - вес брутто (вес груза c упаковкой)

В класс Cargo добавьте метод printInfo(), который выводит в консоль информацию о грузе:
Длина: 91
 Ширина: 81
 Высота: 46
 Тип упаковки: Картонная коробка
 Вес нетто: 14.0
 Вес брутто: 14.3



Создайте класс Warehouse (Склад).
В нем объявите метод getPack (получить упаковку), который принимает в качестве параметра объект DeliveryObject и возвращает объект Pack со значениями Д/Ш/В на 1 больше, чем  Д/Ш/В у объекта доставки, значение type оставьте по-умолчанию, а значение weight установите равным 0.3.
В классе Warehouse объявите метод packCargo (упаковать груз) который принимает в качестве параметра объект DeliveryObject и возвращает объект Cargo. Для создания объекта Cargo сначала вам потребуется получить подходящую упаковку, чтобы использовать её значения Д/Ш/В а также поле type. Для заполнения полей нетто и брутто используйте значения weight груза и коробки


В методe task(), создайте объект DeliveryObject. В конструктор передайте значения, введенные пользователем в консоль.
Упакуйте этот груз вызвав метод packCargo() у объекта Warehouse.
У полученного упакованного груза вызовите метод printInfo().
Sample Input:
90 80 45 14
*/

class DeliveryObject (val length: Int, val width: Int, val height: Int, val weight: Double ){
}
class Pack (val length: Int, val width: Int, val height: Int, val type : String = "Картонная коробка",val weight: Double ){
}

class Cargo (val length: Int, val width: Int, val height: Int, val type : String,val netWeight: Double,val grossWeight: Double ){
    fun printInfo(){
        println("Длина: $length \n" +
                " Ширина: $width \n" +
                " Высота: $height \n" +
                " Тип упаковки: $type \n" +
                " Вес нетто: $netWeight \n" +
                " Вес брутто: $grossWeight ")
    }
}

class Warehouse {
    fun getPack  (deliveryObject: DeliveryObject ): Pack  {
        val result =Pack(deliveryObject.length + 1 ,deliveryObject.width + 1,deliveryObject.height + 1,"Картонная коробка" , weight = 0.3)
        return result
    }
    fun packCargo(deliveryObject: DeliveryObject):Cargo {
        val pack = getPack(deliveryObject)
        val cargo =Cargo(pack.length, pack.width, pack.height, pack.type, deliveryObject.weight,pack.weight+deliveryObject.weight)
        return cargo
    }
}

fun task5() {
    val wH = Warehouse()
    val dobject = readln().toString().split(" ")
    val deliveryObject =DeliveryObject(dobject[0].toInt(), dobject[1].toInt(), dobject[2].toInt(), dobject[3].toDouble())
    val cargo = wH.packCargo(deliveryObject)
    cargo.printInfo()
}