// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.throwable.shouldHaveMessage
import io.kotest.matchers.comparables.*

@Suppress("unused")
class MoneyTest : FreeSpec({
    // Write your unit tests here

    val oneCent = Money(0, 1)
    val twentyCents = Money(0, 20)
    val fourtyNineCents = Money(0, 49)
    val fiftyCents = Money(0, 50)
    val ninetyNineCents = Money(0, 99)
    
    val oneEuro = Money(1, 0)
    val oneFifty = Money(1, 50)
    val oneNinetyNine = Money(1, 99)
    val twoNinetyNine = Money(2, 99)

    val fiveFifty = Money(5, 50)
    val fiveTen = Money(5, 10)


    // Test that Money object can be created successfully
    "Can create a Money" {
        withClue("euros") { oneFifty.euros shouldBe 1 }
        withClue("cents") { oneFifty.cents shouldBe 50 }
    }

    "Can create a different Money" {
        withClue("euros") { twoNinetyNine.euros shouldBe 2 }
        withClue("cents") { twoNinetyNine.cents shouldBe 99 }
    }


    // Test that Money object cannot be created with an invalid number of euros or cents
    "Exception when creating Money with negative euros" {
        withClue("-1") {
            shouldThrow<IllegalArgumentException> {
                Money(-1, 5)
            }
        }
        withClue("-10") {
            shouldThrow<IllegalArgumentException> {
                Money(-10, 5)
            }
        }
    }

    "Exception when creating Money with negative cents" {
        withClue("-1") {
            shouldThrow<IllegalArgumentException> {
                Money(5, -1)
            }
        }
        withClue("-10") {
            shouldThrow<IllegalArgumentException> {
                Money(5, -10)
            }
        }
    }

    "Exception when creating Money with cents greater than 99" {
        withClue("100") {
            shouldThrow<IllegalArgumentException> {
                Money(5, 100)
            }
        }
        withClue("110") {
            shouldThrow<IllegalArgumentException> {
                Money(5, 110)
            }
        }
    }

    "Exception when creating Money with 0 euros and 0 cents" {
        withClue("0, 0") {
            shouldThrow<IllegalArgumentException> {
                Money(0, 0)
            }
        }
    }


    // Test that money objects can be correctly added together
    "€1.50 + €1.00 is €2.50" {
        oneFifty + oneEuro shouldBe Money(2, 50)
    }

    "€1.50 + €2.00 is €3.50" {
        oneFifty + Money(2, 0) shouldBe Money(3, 50)
    }

    "€1.50 + €0.01 is €1.51" {
        oneFifty + oneCent shouldBe Money(1, 51)
    }

    "€2.99 + €0.01 is €3.00" {
        twoNinetyNine + oneCent shouldBe Money(3, 0)
    }


    // Test that money objects can be correctly subtracted from one another
    "€5.50 - €0.20 is €5.30" {
        fiveFifty - twentyCents shouldBe Money(5, 30)
    }

    "€5.50 - €1.20 is €4.30" {
        fiveFifty - Money(1, 20) shouldBe Money(4, 30)
    }

    "€1.10 - €0.15 is €0.95" {
        Money(1, 10) - Money(0, 15) shouldBe Money(0, 95)
    }

    "€5.10 - €1.15 is €3.95" {
        fiveTen - Money(1, 15) shouldBe Money(3, 95)
    }

    "Exception when subtracting a greater value of Money from a lesser value" {
        withClue("€0.20 - €5.50") {
            shouldThrow<IllegalArgumentException> {
                twentyCents - fiveFifty
            }
        }
    }


    // Test that money objects can be converted to strings correctly
    "Money formatted correctly as string" {
        withClue("€0.01") { oneCent.toString() shouldBe "€0.01" }
        withClue("€5.10") { fiveTen.toString() shouldBe "€5.10" }
        withClue("€1.50") { oneFifty.toString() shouldBe "€1.50" }
    }


    // Test that money objects can be accurately compared against one another 
    "Money with a higher value is greater than Money with a lower value" {
        withClue("€0.50 > €0.49") { fiftyCents shouldBeGreaterThan fourtyNineCents }
        withClue("€1.00 > €0.99") { oneEuro shouldBeGreaterThan ninetyNineCents }
    }

    "Money with a lesser value is less than Money with a greater value" {
        withClue("€0.50 < €0.49") { fourtyNineCents shouldBeLessThan fiftyCents }
        withClue("€1.00 < €0.99") { ninetyNineCents shouldBeLessThan oneEuro }
    }

    "Money with a greater or equal value is greater than or equal to Money with a lower or equal value" {
        withClue("€2.99 >= €1.99") { twoNinetyNine shouldBeGreaterThanOrEqualTo oneNinetyNine }
        withClue("€2.99 >= €2.99") { twoNinetyNine shouldBeGreaterThanOrEqualTo twoNinetyNine }
    }

    "Money with a lesser or equal value is less than or equal to Money with a greater or equal value" {
        withClue("€2.99 <= €1.99") { oneNinetyNine shouldBeLessThanOrEqualTo twoNinetyNine }
        withClue("€2.99 <= €2.99") { twoNinetyNine shouldBeLessThanOrEqualTo twoNinetyNine }
    }
})
