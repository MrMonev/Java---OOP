package Polymorphism.MathOperation.task_03;

import Inheritance_Exersizes.NeedForSpeed_04.Vehicle;

public class Mouse extends Mammal{

    public Mouse(String animalName,
                 String animalType,
                 Double animalWeight,
                 String livingRegion) {

        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
