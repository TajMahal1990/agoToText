

fun main() {
    println("Приложение подчета коммисии")

    print(commission("МИР", 36, 0))
    print(" рублей составит коммиссия ")
    println("Bue")

}
fun commission(typeCard: String, transfer: Int, previous: Int): Int {
    return when (typeCard) {
        "MasterCard", "Maestro" -> when {
            transfer > 150_000 || transfer + previous > 600_000 -> -1
            transfer in 301..74999 -> 0
            else -> (transfer * 0.006f).toInt() + 20 // коммисия составит 0.6% + 20 рублей

        }
        "Viza", "МИР" -> when {
            transfer > 150_000 || transfer + previous > 600_000 -> -1
            (transfer * 0.0075f).toInt() <= 35 -> 35 // минимальная сумма коммисии 35 рублей
            else -> (transfer * 0.0075f).toInt() // коммисия составит 0.75%
        }
        "VK Pay" -> when {
            transfer > 15_000 || transfer + previous > 150_000 -> -1
            else -> (transfer * 0.0f).toInt() // нет коммисии
        }

        else -> {
            -1
        }
    }

    }



