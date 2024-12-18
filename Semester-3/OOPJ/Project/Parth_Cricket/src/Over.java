
public class Over {
    private int runsInOver;
    private int wicketsInOver;
    private boolean isNoBall;
    private boolean isWideBall;

    public Over(int runs, int wickets, boolean noBall, boolean wideBall) {
        this.runsInOver = runs;
        this.wicketsInOver = wickets;
        this.isNoBall = noBall;
        this.isWideBall = wideBall;
    }

    public int getTotalRuns() {
        return this.runsInOver + (this.isNoBall ? 1 : 0) + (this.isWideBall ? 1 : 0);
    }

    public int getWickets() {
        return this.wicketsInOver;
    }
}
