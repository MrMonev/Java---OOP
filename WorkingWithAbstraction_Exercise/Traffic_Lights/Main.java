package WorkingWithAbstraction_Exercise.Traffic_Lights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Signals
        Signals[] signals = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Signals::valueOf)
                .toArray(Signals[]::new);


        // Read n -> numbers of updates
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            // Update_Signal
            updateSignals(signals);
            // Print_Signal
            printSignals(signals);
        }

    }

    private static void printSignals(Signals[] signals) {
        for (Signals signal : signals) {
            System.out.print(signal + " ");
        }
        System.out.println();
    }

    private static void updateSignals(Signals[] signals) {
        // red-> green-> yellow -> red
        for (int i = 0; i < signals.length; i++) {
            switch (signals[i]) {

                case RED:
                    signals[i] = Signals.GREEN;
                    break;
                case GREEN:
                    signals[i] = Signals.YELLOW;
                    break;
                case YELLOW:
                    signals[i] = Signals.RED;
                    break;
            }
        }
    }
}
