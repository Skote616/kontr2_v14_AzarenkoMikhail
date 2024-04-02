import kotlinx.coroutines.*

suspend fun main()= runBlocking {
    try {
        var i=1
        println("Введите количество повторов")
        var n= readLine()!!.toInt()
        if (n<=0)
            println("Повторов не может быть 0 и тем более меньше 0")
        else
            while(n>=i)
            {
                println("$i повтор")
                i++
                var car =SportCar("",0.0,0.0,0.0, 0)
                launch {
                    car.Input()
                    car.Volume()
                    car.Output()
                    car.Tirash()
                }
                delay(10000)
                car.Vibor()
            }


    } catch (e: kotlin.Exception) {
        println("Ошибка")
    }
}
