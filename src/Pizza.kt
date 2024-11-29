import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val pizzaPeter =  PizzaPeter(
        neapolitanPizzaPrice = 175.0, romanPizzaPrice = 241.5,
        sicilianPizzaPrice = 167.5, tyroleanPizzaPrice = 215.0
    )
    val pizzaMoscow = PizzaMoscow(
        neapolitanPizzaPrice = 215.0, romanPizzaPrice = 250.5,
        sicilianPizzaPrice = 180.5, tyroleanPizzaPrice = 240.0
    )
    val pizzaRostov = PizzaRostov(
        neapolitanPizzaPrice = 150.0, romanPizzaPrice = 230.5,
        sicilianPizzaPrice = 138.5, tyroleanPizzaPrice = 204.0
    )
    var currentPizzaCity:PizzaCity
    while(true) {
        println("\nДобрый день! Выберите город")
        println("1. Москва\n2. Санкт-Петербург\n3. Ростов-На-Дону\n0. Выход из программы")
        print("Ваш выбор: ")
        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaRostov
            "0" -> break
            else -> {
                println("ERROR")
                continue
            }
        }
        println("\nВыберите пиццу:")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца\n0. Показать статистику")
        print("Ваш выбор: ")
        val pizza = readln()
        selectPizza(pizza, currentPizzaCity)

    }
}

private fun selectPizza(pizza: String, currentPizzaCity: PizzaCity) {
    when (pizza) {
        "1" -> {
            selectAddService(currentPizzaCity)
            currentPizzaCity.neapolitanPizzaSale()
        }

        "2" -> {
            selectAddService(currentPizzaCity)
            currentPizzaCity.romanPizzaSale()
        }

        "3" -> {
            selectAddService(currentPizzaCity)
            currentPizzaCity.sicilianPizzaSale()
        }

        "4" -> {
            selectAddService(currentPizzaCity)
            currentPizzaCity.tyroleanPizzaSale()
        }

        "0" -> currentPizzaCity.showStatistics()


        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}

fun selectAddService(currentPizzaCity: PizzaCity) {
    when (currentPizzaCity) {
        is CheckPhoto -> currentPizzaCity.showCheckPhoto()
        is Drink -> currentPizzaCity.drinkSale()
        is SauceCoffeeCheck -> {
            currentPizzaCity.choiceOfSauce()
            currentPizzaCity.drinkSaleRostov()
            currentPizzaCity.showCheckPhotoRostov()
        }
    }
}