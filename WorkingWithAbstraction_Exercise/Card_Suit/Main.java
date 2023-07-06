package WorkingWithAbstraction_Exercise.Card_Suit;

public class Main {
    public static void main(String[] args) {


        System.out.println("Card Suits:");
        for(WorkingWithAbstraction_Exercise.Card_Suit.CardSuit cardSuit : WorkingWithAbstraction_Exercise.Card_Suit.CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    cardSuit.ordinal(),
                    cardSuit);
        }
    }
}
