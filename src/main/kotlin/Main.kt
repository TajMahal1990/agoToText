fun main() {
    println("Приложение меломан")
    var amountSum = 100000
    var skidka = 100 //скидка при покупку от 1001 до 10000 рублей

    if (amountSum >= 0 && amountSum <= 1000) {
        println("Скидка не предоставляется")
    } else if (amountSum >= 1001 && amountSum <= 10_000) {
        println("Скидка составит 100 рублей")
        print("Сумма покупки вместе со скидкой составит ")
        print(amountSum - 100)
        print(" рублей")
    } else if (amountSum >= 10_001) {
        println("Вам предоставлена скидка 5%")
        print("Сумма покупки вместе со скидкой составит ")
        print(amountSum - (amountSum / 100) * 5)
        print(" рублей")
    } else println("Ошибка при указании суммы")
}