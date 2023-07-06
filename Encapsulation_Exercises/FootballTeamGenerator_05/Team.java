package Encapsulation_Exercises.FootballTeamGenerator_05;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.players = new ArrayList<>();
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        boolean isRemoved = this.players.removeIf(p -> p.getName().equals(name));
        if(!isRemoved) {
            String massage = String.format("Player %s is not in %s team.", name, this.name);
           throw new IllegalArgumentException(massage);
        }
    }

    public double getRating() {
        // Ако е празна колекцията ще ни върне (0)
        return this.players
                .stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0);
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            String isEmpty = String.format("A name should not be empty.");
            throw new IllegalArgumentException(isEmpty);
        } else {
            this.name = name;
        }
    }
}
