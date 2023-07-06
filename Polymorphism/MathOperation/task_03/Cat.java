package Polymorphism.MathOperation.task_03;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;


    public Cat(String animalName,
               String animalType,
               Double animalWeight,
               String livingRegion,
               String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        String template = "%s[%s, %s %.1f, %s, %s]";
        return String.format(
                template,
                this.getAnimalName(),
                this.getAnimalType(),
                this.breed,
                this.getAnimalWeight(),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}

