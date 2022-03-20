var sumBuy: Int = 0
fun main() {
    buy(100000, false)
    buy(80000, false)
    buy(300000, false)
    buy(50000, true)
    buy(700000, true)
    buy(70000, true)
}
fun buy(sum: Int, regularCustomer: Boolean){
    sumBuy += sum
    println("Сумма покупки: " + (sum / 100) + " руб. " + (sum % 100) + " коп.")
    var amountPaid: Double
    if (sumBuy > 100000 && sumBuy <= 1000000){
        //я не очень понял условие задачи со скидкой в 100 руб.
        if (sum > 10000) {
            amountPaid = sum - 10000.0
            println("Ваша скидка составляет 100 руб")
        } else {
            amountPaid = sum.toDouble()
        }
    } else if (sumBuy > 1000000){
        amountPaid = sum - (sum * 0.05)
        println("Ваша скидка составляет 5%")
    } else {
        amountPaid = sum.toDouble()
    }
    if (regularCustomer){
        println("Вы являетесь постоянным клиентом и получаете скидку в 1%")
        amountPaid = amountPaid - (amountPaid * 0.01)
    }
    println("Итоговая сумма: " +  (amountPaid / 100).toInt() + " руб. " + (amountPaid % 100).toInt() + " коп.")
    println("Всего покупок на сумму " + (sumBuy / 100) + " руб. " + (sumBuy % 100) + " коп.")
    println()
}