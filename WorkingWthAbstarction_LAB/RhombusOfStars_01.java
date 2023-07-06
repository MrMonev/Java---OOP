package WorkingWthAbstarction_LAB;

import java.util.Scanner;

public class RhombusOfStars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= size; i++) {
            printRow(i,size - i);
        }
        for (int i =  size - 1; i > 0; i--) {
            printRow(i, size - i);
        }

    }
    public static void printRow(int countStars, int countOfSpace) {
        for (int i = 0; i < countOfSpace; i++) {
            System.out.print(" ");
        }


        for (int i = 1; i <= countStars; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
