// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "List {20.5} containing 1 element has a median of 20.5" {
        val numbers = listOf(20.5f)
        median(numbers) shouldBe (20.5f plusOrMinus tolerance)
    }
    "List {20.5, 10.0} containing 2 elements has a median of 15.25" {
        val numbers = listOf(20.5f, 10.0f)
        median(numbers) shouldBe (15.25f plusOrMinus tolerance)
    }

    "List {20.5, 10.0, 5.7} containing 3 elements has a median of 10.0" {
        val numbers = listOf(20.5f, 10.0f, 5.7f)
        median(numbers) shouldBe (10.0f plusOrMinus tolerance)
    }

    "List {20.5, 10.0, 5.7, 9.1} containing 4 elements has a median of 9.55" {
        val numbers = listOf(20.5f, 10.0f, 5.7f, 9.1f)
        median(numbers) shouldBe (9.55f plusOrMinus tolerance)
    }
})
