// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(doc: String, textToRedact: String, redChar: Char = 'X'): String {
    // Build a string with the size of the text to be redacted
    val redaction = buildString {
        for (n in 1..textToRedact.length) {
            append(redChar)
        }
    }
    // Replace the redacted text with the redaction
    val redactedDoc = doc.replace(textToRedact, redaction)

    return redactedDoc
}