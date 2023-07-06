package Polymorphism.MathOperation.task_03;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    private String livingRegion;

    public Mammal(String animalName,
                  String animalType,
                  Double animalWeight,
                  String livingRegion) {

        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            this.setFoodEaten(food.getQuantity());
        } else {
            String type = this.getClass().getSimpleName();
            System.out.println((type.equalsIgnoreCase("mouse") ? "Mice" : type)
                    + "s are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        String template = "%s[%s, %.1f, %s, %s]";
        return String.format(
                template,
                this.getAnimalName(),
                this.getAnimalType(),
                this.getAnimalWeight(),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}
