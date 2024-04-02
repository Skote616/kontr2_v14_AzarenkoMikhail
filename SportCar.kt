import kotlin.random.Random

class SportCar(mark:String, power:Double, price:Double, volume:Double, kol:Int):Car(mark,power,price,volume,kol) {
    fun Vibor(){
        try {
            println("Выберите спортивный автомобиль который вам приглянулся\n1-Subaru\n2-Toyota\n3-Nissan")
            var answer = readLine()!!.toInt()
            if (answer == 1)
                println("Subaru Impreza - японец, который до сих пор актуален, выглядит отлично и характеристики не обижают!")
            if (answer == 2)
                println("Toyota Supra - легенда среди японских машин 80-х годов!")
            if (answer == 3)
                println("Nissan Skyline - действительно хороший выбор!")
            else
                println("Выбор неверный")
        }catch (e:Exception){println("Ошибка")}
    }

    fun Volume(){
        try{
            println("Введите объём двигателя автомобиля")
            volume= readln()!!.toDouble()

        }catch (e:Exception){println("Ошибка")}
    }

    override fun Tirash() {

            kol= Random.nextInt(1,15000)
            println("Количество выпущенных машин - $kol")

    }
}