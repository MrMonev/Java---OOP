package WorkingWithAbstraction_Exercise.cards_with_power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String card = scanner.nextLine();
        String suit = scanner.nextLine();

        Deck.CardRanks cardRanks = Deck.CardRanks.valueOf(card);
        Deck.CardSuit cardSuit = Deck.CardSuit.valueOf(suit);

        Deck deck = new Deck(cardRanks, cardSuit);


        int power = cardRanks.getPower() + cardSuit.getPower();
        System.out.printf("Card name: %s of %s; Card power: %d",
                cardRanks,
                cardSuit,
                deck.getPower()
                );
    }
}
