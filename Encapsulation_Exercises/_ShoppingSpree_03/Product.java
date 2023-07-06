package Encapsulation_Exercises._ShoppingSpree_03;

public class Product {

    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);

    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    private void setCost(double cost) {
        if(cost  < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.cost = cost;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
}
