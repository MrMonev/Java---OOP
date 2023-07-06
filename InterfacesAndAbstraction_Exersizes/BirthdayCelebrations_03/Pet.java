package InterfacesAndAbstraction_Exersizes.BirthdayCelebrations_03;

import InterfacesAndAbstraction_Exersizes.MultipleImplementation_02.Birthable;

public class Pet implements Birthable {

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    @Override
    public String getBirthDate() {
        return this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }
}
