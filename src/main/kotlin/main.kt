fun main() {
    val purchase = 100000
    val regularUser = true
    var price: Int = 0
    if (purchase <= 1000 && purchase >= 0) {
        price = purchase
    } else if (purchase <= 10000 && purchase >= 1001) {
        price = purchase - 100
    } else if (purchase >= 10001) {
        price = (purchase - purchase * 0.05).toInt()
    }



    if (regularUser) {
        price -= ((price * 0.01)).toInt()
    }

    println(price)
}