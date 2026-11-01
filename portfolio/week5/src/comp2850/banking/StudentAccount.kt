// COMP2850 Portfolio: Week 5
// StudentAccount class

package comp2850.banking

const val MAX_OVERDRAFT = 100

class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft: Int = 0
        set(value) {
            require(value in 0..100) { "Overdraft must be within the range 0 to 100" }
            field = value
        }

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"
    
    fun withdrawalsAllowed() : Boolean {
        if (balance > -overdraft) return true

        return false
    }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(amount <= (balance + overdraft)) { "Insufficient funds for withdrawal" }
        balance -= amount
    }
}