package InterfacesAndAbstraction_Exersizes.MilitaryElite_06.Interfaces;

import java.util.Collection;

public interface Commando {

    void addMission(Mission mission);

    Collection<Mission> getMissions();
}
