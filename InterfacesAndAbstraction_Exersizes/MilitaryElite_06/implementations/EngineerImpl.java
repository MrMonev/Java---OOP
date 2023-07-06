package InterfacesAndAbstraction_Exersizes.MilitaryElite_06.implementations;

import InterfacesAndAbstraction_Exersizes.MilitaryElite_06.Interfaces.Engineer;
import InterfacesAndAbstraction_Exersizes.MilitaryElite_06.Interfaces.Repair;

import java.util.ArrayList;
import java.util.Collection;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private Collection<Repair> repairs;

    public EngineerImpl(int id,
                        String corps,
                        String firstName,
                        String lastName,
                        double salary,
                        Collection<Repair> repairs) {
        super(id, corps, firstName, lastName, salary);
        this.repairs = repairs;
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }

    public void setRepairs(Collection<Repair> repairs) {
        if (repairs != null) {
            this.repairs = repairs;
        } else {
            this.repairs = new ArrayList<>();
        }
    }
}
