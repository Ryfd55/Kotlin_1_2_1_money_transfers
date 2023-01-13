fun main() {
    println("Введите сумму перевода в копейках:")
    val amount: Int =
        readLine()!!.toInt()
    val commission = 0.75
    val minCommission = 3500
    val result = if ((amount * commission / 100) < minCommission)
        minCommission
    else
        amount * commission
    print("Комиссия составляет ${result.toInt()} копеек")
}