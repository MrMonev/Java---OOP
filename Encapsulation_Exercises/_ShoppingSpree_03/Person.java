package Encapsulation_Exercises._ShoppingSpree_03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private double money;

    private List<Product> products;

    public Person(String name, double money) {
        this.setMoney(money);
        this.setName(name);
        this.products = new ArrayList<>();
    }
    public void buyProduct(Product product) {
        if(product.getCost() > this.money) {
            String message = String.format("%s can't afford %s", this.name, product.getName());
           // throw new IllegalArgumentException(message);
            System.out.println(message);
        } else {
            this.products.add(product);
            this.money -= product.getCost();
        }
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(this.products);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
         if(name.trim().isEmpty()) {
             throw new IllegalArgumentException("Name cannot be empty");
         }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }
}
