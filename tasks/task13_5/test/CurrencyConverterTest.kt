// Task 13.5: unit tests for CurrencyConverter
// (using a stub for ExchangeRateService)

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import io.mockk.Runs
import io.mockk.every
import io.mockk.just
import io.mockk.mockk

const val tolerance = 0.00001

class CurrencyConverterTest : FreeSpec({
    // Add your code here
    val service = mockk<ExchangeRateService>()

    every { service.updateRates() } just Runs
    every { service.rateFor("GBP") } returns 1.0
    every { service.rateFor("USD") } returns 1.5
    every { service.rateFor("JPY") } returns 190.0

    val conv = CurrencyConverter(service)

    "Amount can be converted to GBP" {
        conv.convertTo("GBP", 2.0) shouldBe (2.0 plusOrMinus tolerance)
    }

    "Amount can be converted to USD" {
        conv.convertTo("USD", 2.0) shouldBe (3.0 plusOrMinus tolerance)
    }

    "Amount can be converted to JPY" {
        conv.convertTo("JPY", 2.0) shouldBe (380.0 plusOrMinus tolerance)
    }
})
