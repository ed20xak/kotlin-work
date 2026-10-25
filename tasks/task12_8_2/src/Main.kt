// Task 12.8.2: program to manipulate playing cards
import Card.Rank
import Card.Suit

fun main() {
    val cards = buildList {
        for (suit in Suit.entries) {
            for (rank in Rank.entries) {
                add(Card(rank, suit))
            }
        }
    }

    val shuffledCards = cards.shuffled()
    
    for (card in shuffledCards) {
        println(card.fullName)
    }
}