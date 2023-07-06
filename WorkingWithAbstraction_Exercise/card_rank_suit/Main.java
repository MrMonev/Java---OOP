package WorkingWithAbstraction_Exercise.card_rank_suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        System.out.printf("%s:%n", command);
        switch (command) {
            case "Card Suits":
                printOrdinalAndNameValues(CardSuit.values());
                break;
            case "Card Ranks":
                printOrdinalAndNameValues(CardRanks.values());
                break;
        }
    }

    private static <E extends Enum<E>> void printOrdinalAndNameValues(Enum<E>[] values) {
        for (Enum<E> value : values) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    value.ordinal(),
                    value);
        }
    }

}
