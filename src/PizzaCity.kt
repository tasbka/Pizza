
abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val tyroleanPizzaPrice: Double
) {
    var neapolitanPizzaCount = 0
    var neapolitanPizzaCoffeeCount = 0 //счетчик для проверки: купили ли кофе к этой пицце

    var romanPizzaCount = 0
    var romanPizzaCoffeeCount = 0 //счетчик для проверки: купили ли кофе к этой пицце

    var sicilianPizzaCount = 0
    var sicilianPizzaCoffeeCount = 0 //счетчик для проверки: купили ли кофе к этой пицце

    var tyroleanPizzaCount = 0
    var tyroleanPizzaCoffeeCount = 0 //счетчик для проверки: купили ли кофе к этой пицце

    var checksShownCount = 0 //кол-во показанных чеков
    var checksNoShownCount = 0 //кол-во не показанных чеков
    var totalAmountOfSale = 0 //общая сумма скидок

    var sumCoffeeCount = 0 //кол-во проданных кофе
    var sumCoffeeCountNo = 0 //кол-во не проданных кофе
    var totalAmountOfCoffee = 0 //общая сумма выручки за кофе

    var sumCheeseSauce = 0 //кол-во проданных сырных соусов
    var sumThousandIslandsSauce = 0 //кол-во проданных соусов тысяча островов
    var totalAmountOfCheeseSauce = 0 //общая сумма выручки за сырный соус
    var totalAmountOfThousandIslandsSauce = 0 //общая сумма выручки за соус тысяча островов
    var coffeeRostov = 0 // переменная для определения купил ли кто-то кофе в ростове
    var checkRostov = 0 // переменная для определения показал ли кто-то чек в ростове
    var noCoffeeRostov = 0
    var noCheckRostov = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()


    private fun statisticsCoffee(money: Double){

        println("Количество проданных кофе: $sumCoffeeCount\nОбщая сумма выручки за кофе: $totalAmountOfCoffee")
        val percentBuy = (sumCoffeeCount.toDouble() / (sumCoffeeCountNo + sumCoffeeCount)) * 100
        val percentNoBuy = (sumCoffeeCountNo.toDouble() / (sumCoffeeCountNo + sumCoffeeCount)) * 100
        println(
            "\nПроцентное соотношение: сколько человек покупают кофе, а сколько – отказываются\n" +
                    "$percentBuy % покупают\n" +
                    "$percentNoBuy % отказываются\n"
        )

        //Выводить на экран статистику, показывающую, к какой пицце чаще покупают кофе.
        //Статистику выводить в количественном и процентном видах
        val percentNPCoffeeCount = (neapolitanPizzaCoffeeCount.toDouble() /(neapolitanPizzaCoffeeCount + romanPizzaCoffeeCount + sicilianPizzaCoffeeCount + tyroleanPizzaCoffeeCount)) * 100
        val percentRPCoffeeCount = (romanPizzaCoffeeCount.toDouble() /(neapolitanPizzaCoffeeCount + romanPizzaCoffeeCount + sicilianPizzaCoffeeCount + tyroleanPizzaCoffeeCount)) * 100
        val percentSPCoffeeCount = (sicilianPizzaCoffeeCount.toDouble() /(neapolitanPizzaCoffeeCount + romanPizzaCoffeeCount + sicilianPizzaCoffeeCount + tyroleanPizzaCoffeeCount)) * 100
        val percentTPCoffeeCount = (tyroleanPizzaCoffeeCount.toDouble() /(neapolitanPizzaCoffeeCount + romanPizzaCoffeeCount + sicilianPizzaCoffeeCount + tyroleanPizzaCoffeeCount)) * 100
        println("Количество покупок кофе:\n" +
                "К неаполитанской пицце: $neapolitanPizzaCoffeeCount\n" +
                "в процентах: $percentNPCoffeeCount %\n\n" +
                "К римской пицце: $romanPizzaCoffeeCount\n" +
                "в процентах: $percentRPCoffeeCount %\n\n" +
                "К сицилийской пицце: $sicilianPizzaCoffeeCount\n" +
                "в процентах: $percentSPCoffeeCount %\n\n" +
                "К тирольской пицце: $tyroleanPizzaCoffeeCount\n" +
                "в процентах: $percentTPCoffeeCount %\n\n")

        if ((neapolitanPizzaCoffeeCount>=romanPizzaCoffeeCount)&&
            (neapolitanPizzaCoffeeCount>=sicilianPizzaCoffeeCount)&&
            (neapolitanPizzaCoffeeCount>=tyroleanPizzaCoffeeCount)){

            println("Кофе чаще покупают к неаполитанской пицце\n")
        }

        if ((romanPizzaCoffeeCount>=neapolitanPizzaCoffeeCount)&&
            (romanPizzaCoffeeCount>=sicilianPizzaCoffeeCount)&&
            (romanPizzaCoffeeCount>=tyroleanPizzaCoffeeCount)){

            println("Кофе чаще покупают к римской пицце\n")
        }


        if ((sicilianPizzaCoffeeCount>=neapolitanPizzaCoffeeCount)&&
            (sicilianPizzaCoffeeCount>=romanPizzaCoffeeCount)&&
            (sicilianPizzaCoffeeCount>=tyroleanPizzaCoffeeCount)) {

            println("Кофе чаще покупают к сицилийской пицце\n")
        }

        if ((tyroleanPizzaCoffeeCount>=neapolitanPizzaCoffeeCount)&&
            (tyroleanPizzaCoffeeCount>=romanPizzaCoffeeCount)&&
            (tyroleanPizzaCoffeeCount>=sicilianPizzaCoffeeCount)) {

            println("Кофе чаще покупают к тирольской пицце\n")
        }
    }

    private fun statisticsCheckPhoto(money: Double){

        println("Количество показанных чеков: $checksShownCount \nОбщая сумма скидок: $totalAmountOfSale")
        val percentShow = (checksShownCount.toDouble() / (checksNoShownCount + checksShownCount)) * 100
        val percentNoShow = (checksNoShownCount.toDouble() / (checksNoShownCount + checksShownCount)) * 100
        println(
            "\nПроцентное соотношение: сколько человек показывают фотографию чека, а сколько – нет.\n" +
                    "$percentShow % показывают\n" +
                    "$percentNoShow % не показывают\n"
        )
    }
    fun showStatistics(){
        println("\nПродано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано тирольской пиццы: $tyroleanPizzaCount")

        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice + tyroleanPizzaCount * tyroleanPizzaPrice

        //МОСКВА
        if ((checksShownCount == 0) && (checksNoShownCount>0) && (noCheckRostov == 0)){

            println("\nНикто не показал фото чека")
            println("Выручка по пиццерии: $money р.\n")
        }
        //Подсчитать в процентном соотношении, сколько человек показывают фотографию чека, а сколько – нет
        else if ((checksShownCount != 0)&&(checkRostov == 0)) {
            //Выручка по пиццерии показывается с учетом скидок и проданных кофе
            println("\nВыручка по пиццерии с учетом скидок: ${money-totalAmountOfSale} р.")

            statisticsCheckPhoto(money)
        }

        //ПИТЕР
        if ((sumCoffeeCount == 0) && (sumCoffeeCountNo>0) && (noCoffeeRostov == 0)) {
            println("\nНикто не купил кофе к пицце")
            println("Выручка по пиццерии: $money р.\n")
        }
        //Подсчитать в процентном соотношении, сколько человек покупают кофе, а сколько – отказываются
        else if ((sumCoffeeCount != 0)&&(coffeeRostov == 0)) {
            //Выручка по пиццерии показывается с учетом скидок и проданных кофе
            println("\nВыручка по пиццерии с учетом проданных кофе: ${money+totalAmountOfCoffee} р.")

            statisticsCoffee(money)

        }

        //РОСТОВ-НА-ДОНУ

        //В статистику добавить количество проданных соусов и выручку за каждый из видов.
        //Также итоговая сумма по данной пиццерии должна учитывать все скидки и выручку за дополнительные услуги(скидка за фото чека, продажа кофе, продажа соусов)

        if ((sumCoffeeCount == 0) && (sumCoffeeCountNo > 0) && (checksShownCount == 0) && (checksNoShownCount > 0) && ((sumCheeseSauce + sumThousandIslandsSauce) == 0)) {
            println("\nНикто не воспользовался дополнительными услугами")
            println("Выручка по пиццерии: $money р.\n")
        }
        //статистика по продаже соусов
        if (sumCheeseSauce + sumThousandIslandsSauce !=0) {
            println("\nСумма выручки пиццерии с учетом всех дополнительных услуг: ${money+totalAmountOfCheeseSauce+totalAmountOfThousandIslandsSauce+totalAmountOfCoffee-totalAmountOfSale} р.")
            println("\nКоличество проданных сырных соусов: $sumCheeseSauce\n" +
                    "Сумма выручки за продажу сырного соуса: $totalAmountOfCheeseSauce\n" +
                    "\nКоличество проданных соусов тысяча островов $sumThousandIslandsSauce\n" +
                    "Сумма выручки за продажу соуса тысяча островов $totalAmountOfThousandIslandsSauce\n")
        }
        //статистика по продаже кофе
        if ((sumCoffeeCount > 0) && (coffeeRostov == 1)) {
            statisticsCoffee(money)
        }
        //статистика по предъявлению фотогр3афии чека
        if ((checksShownCount > 0) && (checkRostov == 1)) {
            statisticsCheckPhoto(money)
        }
    }
}
