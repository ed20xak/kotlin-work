// Task 12.8.2: class to represent playing cards

class Card(val rank: Rank, val suit: Suit) {

    enum class Rank(val symbol: Char) {
        Ace('A'),
        Two('2'),
        Three('3'),
        Four('4'),
        Five('5'),
        Six('6'),
        Seven('7'),
        Eight('8'),
        Nine('9'),
        Ten('T'),
        Jack('J'),
        Queen('Q'),
        King('K');

        override fun toString() = "$symbol"
    }

    enum class Suit(val symbol: Char) {
        Clubs('♣'),
        Diamonds('♦'),
        Hearts('♥'),
        Spades('♠');

        val plainSymbol get() = name[0]

        override fun toString() = "$symbol"
    }

    val fullName get() = "${rank.name}" + " of " + "${suit.name}"

    override fun toString() = "$rank$suit"
}