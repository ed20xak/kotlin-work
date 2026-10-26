// Task 13.4: Money class

data class Money(val euros: Int, val cents: Int) : Comparable<Money> {
    init {
        require(euros >= 0) { "Euros cannot be negative" }
        require(cents in 0..99) { "Cents cannot be negative or greater than 99" }
        require(!(euros == 0 && cents == 0)) { "Cannot have 0 euros and 0 cents" }
    }

    val eurosToCents get() = euros*100

    operator fun plus(other: Money) =
        if (cents + other.cents > 99) Money(euros + other.euros + 1, cents + other.cents - 100)
        else Money(euros + other.euros, cents + other.cents)

    operator fun minus(other: Money): Money {
        require(eurosToCents + cents > other.eurosToCents + other.cents) { "Result of subtraction is invalid" }
        if (cents - other.cents < 0) return Money(euros - other.euros - 1, cents - other.cents + 100)
        else return Money(euros - other.euros, cents - other.cents)
    }
        

    override fun compareTo(other: Money) = (eurosToCents + cents).compareTo(other.eurosToCents + other.cents)

    override fun toString() = 
        if (cents < 10) "€$euros.0$cents"
        else "€$euros.$cents"
}