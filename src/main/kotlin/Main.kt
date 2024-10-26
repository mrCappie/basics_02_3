package org.example

fun main() {

    val regularCustomer = true

    val amount = 15000
    val discountPercent = 5
    val additionalDiscountPercent = 1

    var discount: Int
    var price = amount

    if (amount > 1001) {
        discount = if (amount <= 10000) {
            100
        } else {
            price * discountPercent / 100
        }
        price -= discount
    }

    if (regularCustomer) {
        discount = price * additionalDiscountPercent / 100
        price -= discount
    }

    println(price)
}