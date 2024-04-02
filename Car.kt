abstract class Car(override var mark:String,
                   override var power: Double,
                   override var price: Double,
    override var volume:Double,
                  var kol:Int

): inter {
    override fun Input() {
        try{
            println("Введите марку автомобиля")
            mark= readln()
            println("Введите мощность автомобиля")
            power= readln()!!.toDouble()
            println("Введите его стоимость")
            price= readln()!!.toDouble()
        }catch (e:Exception){
            println("Ошибка")}
    }

    override fun Output() {
        println("Информация об автомобиле\nМарка:$mark Мощность:$power Цена: $price")
    }

    abstract fun Tirash()

}
