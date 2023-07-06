package InterfacesAndAbstraction_Exersizes.MilitaryElite_06.implementations;

import InterfacesAndAbstraction_Exersizes.MilitaryElite_06.Interfaces.Commando;
import InterfacesAndAbstraction_Exersizes.MilitaryElite_06.Interfaces.Mission;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    private Collection<Mission> missions;

    public CommandoImpl(int id,
                        String corps,
                        String firstName,
                        String lastName,
                        double salary,
                        Collection<Mission> missions) {
        super(id, corps, firstName, lastName, salary);
        this.setMissions(missions);
    }

    public void setMissions(Collection<Mission> missions) {
        if (missions != null) {
            this.missions = missions;
        } else {
            this.missions = new ArrayList<>();
        }
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return Collections.unmodifiableCollection(this.missions);
    }
}
