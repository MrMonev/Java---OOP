package InterfacesAndAbstraction_Exersizes.MilitaryElite_06.implementations;

import InterfacesAndAbstraction_Exersizes.MilitaryElite_06.Interfaces.LieutenantGeneral;
import InterfacesAndAbstraction_Exersizes.MilitaryElite_06.Interfaces.Private;

import java.util.Collection;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private Collection<Private> privates;

    public LieutenantGeneralImpl(int id,
                                 String firstName,
                                 String lastName,
                                 double salary,
                                 Collection<Private> privatesCollections) {

        super(id, firstName, lastName, salary);

        this.privates = privatesCollections;
    }

    @Override
    public Collection<Private> getPrivates() {
        return this.privates;
    }

    @Override
    public void addPrivate(Private priv) {
        this.privates.add(priv);
    }
}
