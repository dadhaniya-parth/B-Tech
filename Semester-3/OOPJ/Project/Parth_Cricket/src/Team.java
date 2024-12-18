
public class Team {
    private String name;
    private int runs;
    private int wickets;

    public Team(String name) {
        this.name = name;
        this.runs = 0;
        this.wickets = 0;
    }

    public void addRuns(int runs) {
        this.runs += runs;
    }

    public void addWicket() {
        this.wickets += 1;
    }

    public String getName() {
        return this.name;
    }

    public int getRuns() {
        return this.runs;
    }

    public int getWickets() {
        return this.wickets;
    }
}
