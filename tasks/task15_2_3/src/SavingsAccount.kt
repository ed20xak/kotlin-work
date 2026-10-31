// Task 15.2.3: SavingsAccount class
import kotlin.math.roundToInt

class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder) {
    init {
        require(rate > 0) { "Rate must be greater than 0" }
    }

    fun applyInterest() {
        val accrInterest = balance * (rate/100)
        deposit(accrInterest.roundToInt())
    }
}