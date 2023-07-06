package Polymorphism.MathOperation.task_03;

public abstract class Animal {

    private String animalName;
    private String animalType;
    private Double animalWeight;

    private int foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;

    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    protected void setFoodEaten(Integer foodEaten) {
        this.foodEaten += foodEaten;
    }

    protected String getAnimalName() {
        return animalName;
    }

    protected String getAnimalType() {
        return animalType;
    }

    protected Double getAnimalWeight() {
        return animalWeight;
    }

    protected Integer getFoodEaten() {
        return foodEaten;
    }
}