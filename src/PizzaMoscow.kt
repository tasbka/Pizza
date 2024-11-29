class PizzaMoscow(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), CheckPhoto {


    override fun showCheckPhoto() {
        println("\nУ вас есть фото чека?")
        println("Введите для выбора:\n" +
                "1. Да\n" +
                "Что-угодно: Нет")
        print("Ваш выбор: ")
        if(readln() == "1") {
            println("Вам будет скидка 50 рублей с покупки")
            checksShownCount++
            totalAmountOfSale +=50
        }
        else checksNoShownCount++
    }

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("\nСпасибо за покупку неаполитанской пиццы в Москве")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("\nСпасибо за покупку римской пиццы в Москве")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("\nСпасибо за покупку сицилийской пиццы в Москве")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("\nСпасибо за покупку тирольской пиццы в Москве")
    }
}