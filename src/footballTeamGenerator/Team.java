package footballTeamGenerator;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {

    }

    public void removePlayer(String player) {

    }

    public double getRating() {

    }
}
