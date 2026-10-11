// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here

    "Mark between 0 and 39 gives a Fail" {
        withClue("Mark = 0") { grade(0) shouldBe "Fail" }
        withClue("Mark = 25") { grade(25) shouldBe "Fail" }
        withClue("Mark = 39") { grade(39) shouldBe "Fail" }
    }

    "Mark between 40 and 69 gives a Pass" {
        withClue("Mark = 40") { grade(40) shouldBe "Pass" }
        withClue("Mark = 55") { grade(55) shouldBe "Pass" }
        withClue("Mark = 69") { grade(69) shouldBe "Pass" }
    }

    "Mark between 70 and 100 gives a Distinction" {
        withClue("Mark = 70") { grade(70) shouldBe "Distinction" }
        withClue("Mark = 85") { grade(85) shouldBe "Distinction" }
        withClue("Mark = 100") { grade(100) shouldBe "Distinction" }
    }

    "Mark above 100 is invalid" {
        withClue("Mark = 101") { grade(101) shouldBe "?" }
        withClue("Mark = 125") { grade(125) shouldBe "?" }
    }

    "Mark below 0 is invalid" {
        withClue("Mark = -1") { grade(-1) shouldBe "?" }
        withClue("Mark = -25") { grade(-25) shouldBe "?" }
    }
})
