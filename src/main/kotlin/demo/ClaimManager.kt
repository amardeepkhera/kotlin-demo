package demo

import java.math.BigDecimal

data class Claim(val id: String?,
                 val type: String,
                 val amount: BigDecimal,
                 val status: String = "open")

fun main(args: Array<String>) {

    val motorClaim = Claim(null, "motor", BigDecimal("400"))

    val homeClaim = motorClaim.copy(id = null, type = "home", amount = BigDecimal("1000"))

    if (motorClaim == homeClaim) {
        println("Same claims")
    }

    val javaClaim = JavaClaim().apply {
        type = "boat"
        amount = BigDecimal("2000")
        status = "open"
    }

}






