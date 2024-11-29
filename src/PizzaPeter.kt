class PizzaPeter(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), Drink {

    private var choiceCoffee = ""
    override fun drinkSale() {
        println("\nВы будете кофе?")
        println("Введите для выбора:\n" +
                "1. Да\n" +
                "Что-угодно: Нет")
        print("Ваш выбор: ")
        choiceCoffee = readln()
        if(choiceCoffee == "1") {
            sumCoffeeCount++
            totalAmountOfCoffee+=200
            println("С Вас 200 рублей")
        }
        else sumCoffeeCountNo++
    }

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        if (choiceCoffee == "1"){
            neapolitanPizzaCoffeeCount++
        }
        println("\nСпасибо за покупку неаполитанской пиццы в Санкт-петербурге")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        if (choiceCoffee == "1"){
            romanPizzaCoffeeCount++
        }
        println("\nСпасибо за покупку римской пиццы в Санкт-Петербурге")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        if (choiceCoffee == "1"){
            sicilianPizzaCoffeeCount++
        }
        println("\nСпасибо за покупку сицилийской пиццы в Санкт-Петербурге")
    }
    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        if (choiceCoffee == "1"){
            tyroleanPizzaCoffeeCount++
        }
        println("\nСпасибо за покупку тирольской пиццы в Санкт-Петербурге")
    }
}