package WorkingWthAbstarction_LAB.HotelReservation_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        double price = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Seasons seasons = Seasons.valueOf(tokens[2]);
        DiscountType discountType = DiscountType.valueOf(tokens[3]);

        PriceCalculator priceCalculator = new PriceCalculator(price,days,seasons,discountType);
        double calculate = priceCalculator.calculate();
        System.out.printf("%.2f%n",calculate);
    }
}
