package Encapsulation_Exercises.FootballTeamGenerator_05;

public class Player {


    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;


    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.name = name;
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);



    }
    public double overallSkillLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            String message = String.format("A name should not be empty.");
            throw new IllegalArgumentException(message);
        } else {
            this.name = name;
        }
    }

    private void setEndurance(int endurance) {
        if (!isInValidStat(endurance, "Endurance")) {
            this.endurance = endurance;
        }
    }

    private void setSprint(int sprint) {
        if (!isInValidStat(sprint, "Sprint")) {
            this.sprint = sprint;
        }
    }

    private void setDribble(int dribble) {
        if (!isInValidStat(dribble, "Dribble")) {
            this.dribble = dribble;
        }
    }

    private void setPassing(int passing) {
        if (!isInValidStat(passing, "Passing")) {
            this.passing = passing;
        }
    }

    private void setShooting(int shooting) {
        if (!isInValidStat(shooting, "Shooting")) {
            this.shooting = shooting;
        }
    }

    private boolean isInValidStat(int statValue, String statName) {
        boolean isInValid = statValue <= 0 || statValue >= 100;
        if (isInValid) {
            String message = String.format("%s should be between 0 and 100.\n",statName);
           // System.out.printf("%s should be between 0 and 100.\n", statName);
            throw new IllegalArgumentException(statName);

        }
        return false;
    }
}
