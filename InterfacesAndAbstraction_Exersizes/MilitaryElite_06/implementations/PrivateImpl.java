package InterfacesAndAbstraction_Exersizes.MilitaryElite_06.implementations;

import InterfacesAndAbstraction_Exersizes.MilitaryElite_06.Interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
