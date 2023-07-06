package Inheritance_Exersizes.Person_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        Child child = new Child(name,age);

        System.out.println(name);
        System.out.println(age);
    }
}
