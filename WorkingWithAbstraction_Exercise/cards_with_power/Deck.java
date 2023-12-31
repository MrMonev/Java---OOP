package WorkingWithAbstraction_Exercise.cards_with_power;

public class Deck {


    private CardRanks cardRank;
    private CardSuit cardSuit;

    public Deck(CardRanks cardRanks, CardSuit cardSuit) {
        this.cardRank = cardRanks;
        this.cardSuit = cardSuit;
    }

    public enum CardRanks {
        ACE(14),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private final int power;

        CardRanks(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }

    }

    public enum CardSuit {
        CLUBS(0),
        DIAMONDS(13),
        HEARTS(26),
        SPADES(39);

        private final int power;

        CardSuit(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }
    }

    public int getPower() {
        return this.cardRank.getPower() + this.cardSuit.getPower();
    }
}
