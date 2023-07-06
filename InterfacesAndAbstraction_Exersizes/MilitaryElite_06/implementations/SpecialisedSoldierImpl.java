package InterfacesAndAbstraction_Exersizes.MilitaryElite_06.implementations;

import InterfacesAndAbstraction_Exersizes.MilitaryElite_06.Interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private static final String AIRFORCES = "Airforces";
    private static final String MARINES = "Marines";
    private String corps;


    public SpecialisedSoldierImpl(int id,
                                  String corps,
                                  String firstName,
                                  String lastName,
                                  double salary) {

        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    public void setCorps(String corps) {
        if (MARINES.equals(corps) || AIRFORCES.equals(corps)) {
            this.corps = corps;
        }
    }
}
