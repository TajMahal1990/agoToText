
fun main() {
    println("Приложение: Только что")

    println(agoToText(times))
}
val times = 1260 //нужно указать время в секундах
val minutes = times / 60 // переводим секунды в минуты
val hours = minutes / 60 // переводим минуты в часы

fun agoToText(timeSeconds: Int) = when {
    times > 3 * 24 * 60 * 60 -> "Был(а) давно"
    times > 2 * 24 * 60 * 60 -> "Был(а) позавчера"
    times > 24 * 60 * 60 -> "Был(а) вчера"
    times > 60 * 60 -> "Был(а) в сети $hours час${timeHours(hours)} назад"
    times > 60 -> "Был(а) в сети $minutes минут${timeMinutes(minutes)} назад"
    else -> "Был(а) только что"
}

fun timeMinutes(minutes: Int) = when {
    minutes % 10 == 1 && minutes % 100 != 11 -> "у"
    minutes % 10 in 2..4 && minutes % 100 !in 12..14 -> "ы"
    else -> ""
}

fun timeHours(hours: Int) = when {
    hours == 1 || hours % 100 == 21 -> ""
    hours in 2..4 || hours % 100 > 21 -> "а"
    else -> "ов"
}
