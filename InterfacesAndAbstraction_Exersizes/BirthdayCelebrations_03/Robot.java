package InterfacesAndAbstraction_Exersizes.BirthdayCelebrations_03;

import InterfacesAndAbstraction_Exersizes.MultipleImplementation_02.Identifiable;

public class Robot  implements Identifiable {

    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getModel() {
        return model;
    }
}
