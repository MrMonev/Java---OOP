package Encapsulation_Exercises._ShoppingSpree_03;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split(";"))
                .forEach(p -> {
                    String[] tokens = p.split("=");
                    Person person = new Person(tokens[0], Double.parseDouble(tokens[1]));
                    people.putIfAbsent(person.getName(), person);
                });

        Arrays.stream(scanner.nextLine().split(";"))
                .forEach(p -> {
                    String[] tokens = p.split("=");
                    Product product = new Product(tokens[0], Double.parseDouble(tokens[1]));
                    products.putIfAbsent(product.getName(), product);
                });

        String line = scanner.nextLine();

        while (!line.equals("END")) {

            String[] tokens = line.split("\\s+");

            String personName = tokens[0];
            String productName = tokens[1];

            Person person = people.get(personName);
            Product product = products.get(productName);
            person.buyProduct(product);


            line = scanner.nextLine();
        }

        people.values().forEach(p -> {
            if (p.getProducts().size() == 0) {
                System.out.printf("%s - Nothing bought.%n", p.getName());
            } else {
                System.out.printf("%s - ", p.getName());
                String productsName = p.getProducts()
                        .stream()
                        .map(Product::getName)
                        .collect(Collectors.joining(", "));
                System.out.println(productsName);
            }
        });

    }
}
