class PizzaRostov(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
),  SauceCoffeeCheck {

    private var sauceChoice = ""
    private var choiceCoffee = ""

    override fun choiceOfSauce() {
        println("\nВы будете соус?")
        println("Введите:\n" +
                "1. Да, Сырный соус" +
                "\n2. Да, соус Тысяча островов" +
                "\nЧто-угодно: Нет")
        print("Выш выбор: ")
        sauceChoice = readln()
        if (sauceChoice == "1"){
            sumCheeseSauce++
            totalAmountOfCheeseSauce+=80
            println("С Вас 80 рублей")

        }
        else if (sauceChoice == "2") {
            sumThousandIslandsSauce++
            totalAmountOfThousandIslandsSauce+=90
            println("С Вас 90 рублей")
        }
    }

    override fun drinkSaleRostov() {
        println("\nВы будете кофе?")
        println("Введите для выбора:\n" +
                "1. Да\n" +
                "Что-угодно: Нет")
        print("Ваш выбор: ")
        choiceCoffee = readln()
        if(choiceCoffee == "1") {
            coffeeRostov = 1
            sumCoffeeCount++
            totalAmountOfCoffee+=200
            println("С Вас 200 рублей")
        }
        else {
            noCoffeeRostov = 1
            sumCoffeeCountNo++
        }
    }

    override fun showCheckPhotoRostov() {
        println("\nУ вас есть фото чека?")
        println("Введите для выбора:\n" +
                "1. Да\n" +
                "Что-угодно: Нет")
        print("Ваш выбор: ")
        if(readln() == "1") {
            checkRostov = 1
            checksShownCount++
            totalAmountOfSale +=50
            println("Вам будет скидка 50 рублей с покупки")
        }
        else {
            noCheckRostov = 1
            checksNoShownCount++
        }
    }

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        if (choiceCoffee == "1"){
            neapolitanPizzaCoffeeCount++
        }
        println("\nСпасибо за покупку неаполитанской пиццы в Ростове-На-Дону")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        if (choiceCoffee == "1"){
            romanPizzaCoffeeCount++
        }
        println("\nСпасибо за покупку римской пиццы в Ростове-На-Дону")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        if (choiceCoffee == "1"){
            sicilianPizzaCoffeeCount++
        }
        println("\nСпасибо за покупку сицилийской пиццы в Ростове-На-Дону")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        if (choiceCoffee == "1"){
            tyroleanPizzaCoffeeCount++
        }
        println("\nСпасибо за покупку тирольской пиццы в Ростове-На-Дону")
    }
}