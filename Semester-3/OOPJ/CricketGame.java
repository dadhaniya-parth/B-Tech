import java.util.*;

enum MatchType {
    ODI(50),
    T20(20);

    final int overs;

    MatchType(int overs) {
        this.overs = overs;
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

abstract class CricketEntity {
    String name;
    int runs;

    public CricketEntity(String name) {
        this.name = name;
    }

    abstract void addRuns(int runs);
}

class Player extends CricketEntity {
    int ballsFaced;
    int fours;
    int sixes;

    public Player(String name) {
        super(name);
    }

    @Override
    void addRuns(int runs) {
        this.runs += runs;
        ballsFaced++;
        if (runs == 4) fours++;
        if (runs == 6) sixes++;
    }

    public double getStrikeRate() {
        return ballsFaced == 0 ? 0 : (runs * 100.0) / ballsFaced;
    }
}

class Team extends CricketEntity {
    ArrayList<Player> players;
    int wickets;
    Extras extras;

    public Team(String name) {
        super(name);
        players = new ArrayList<>();
        extras = new Extras();
    }

    @Override
    void addRuns(int runs) {
        this.runs += runs;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addWicket() {
        wickets++;
    }
}

class Extras {
    int wides;
    int noBalls;
    int byes;
    int legByes;

    public int getTotal() {
        return wides + noBalls + byes + legByes;
    }
}

abstract class Match {
    Team team1;
    Team team2;
    Team battingTeam;
    Team bowlingTeam;
    int overs;
    Scanner scanner;
    static final String INPUT_GUIDE = "Enter: 0-6 (runs), W (wicket), N (no-ball), B (wide)";

    public Match(Team team1, Team team2, Scanner scanner) {
        this.team1 = team1;
        this.team2 = team2;
        this.scanner = scanner;
    }

    abstract void setMatchRules();

    public void startMatch() {
        setMatchRules();
        toss();
        playInnings(battingTeam, bowlingTeam);
        Team temp = battingTeam;
        battingTeam = bowlingTeam;
        bowlingTeam = temp;
        playInnings(battingTeam, bowlingTeam);
        announceWinner();
    }

    private void toss() {
        System.out.println("\n--- Time for the toss! ---");
        System.out.print("Team " + team1.name + ", call Heads or Tails (H/T): ");
        String call = scanner.next().toUpperCase();
        boolean isHeads = Math.random() < 0.5;
        System.out.println("The coin shows: " + (isHeads ? "Heads" : "Tails"));
        
        Team tossWinner = (call.equals("H") == isHeads) ? team1 : team2;
        System.out.println(tossWinner.name + " wins the toss!");
        
        System.out.print("Choose to Bat or Bowl (BAT/BOWL): ");
        String choice = scanner.next().toUpperCase();
        if (choice.equals("BAT")) {
            battingTeam = tossWinner;
            bowlingTeam = (tossWinner == team1) ? team2 : team1;
        } else {
            bowlingTeam = tossWinner;
            battingTeam = (tossWinner == team1) ? team2 : team1;
        }
        System.out.println(battingTeam.name + " will bat first.");
    }

    private void playInnings(Team battingTeam, Team bowlingTeam) {
        System.out.println("\n--- " + battingTeam.name + " is batting ---");
        System.out.println(INPUT_GUIDE);
        int currentBatsman = 0;
        for (int over = 1; over <= overs; over++) {
            for (int ball = 1; ball <= 6; ball++) {
                if (battingTeam.wickets == 10) break;
                System.out.print("\nOver " + over + ", Ball " + ball + ": ");
                String input = scanner.next().toUpperCase();
                try {
                    switch (input) {
                        case "W":
                            battingTeam.addWicket();
                            currentBatsman++;
                            System.out.println("Wicket! New batsman in.");
                            break;
                        case "N":
                            handleNoBall(battingTeam, currentBatsman);
                            ball--; // Repeat the ball
                            break;
                        case "WB":
                            handleWideBall(battingTeam);
                            ball--; // Repeat the ball
                            break;
                        default:
                            int runs = Integer.parseInt(input);
                            if (runs < 0 || runs > 6) throw new InvalidInputException("Invalid runs. Enter 0-6.");
                            battingTeam.addRuns(runs);
                            battingTeam.players.get(currentBatsman).addRuns(runs);
                            if (runs == 4) System.out.println("Four!");
                            if (runs == 6) System.out.println("Six!");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. " + INPUT_GUIDE);
                    ball--; // Repeat the ball
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage() + " " + INPUT_GUIDE);
                    ball--; // Repeat the ball
                }
            }
            displayScore(battingTeam);
        }
    }

    private void handleNoBall(Team battingTeam, int currentBatsman) {
        battingTeam.extras.noBalls++;
        battingTeam.addRuns(1);
        System.out.print("No ball! Runs scored (0-6): ");
        int runs = scanner.nextInt();
        battingTeam.addRuns(runs);
        battingTeam.players.get(currentBatsman).addRuns(runs);
        System.out.println("No ball! " + (runs + 1) + " runs added. Free hit next.");
    }

    private void handleWideBall(Team battingTeam) {
        battingTeam.extras.wides++;
        battingTeam.addRuns(1);
        System.out.println("Wide ball! 1 run added.");
    }

    private void displayScore(Team team) {
        System.out.println("\nScore: " + team.name + " - " + team.runs + "/" + team.wickets);
        System.out.println("Overs: " + overs);
    }

    private void announceWinner() {
        System.out.println("\n--- Match ended! ---");
        System.out.println(team1.name + ": " + team1.runs + "/" + team1.wickets);
        System.out.println(team2.name + ": " + team2.runs + "/" + team2.wickets);
        if (team1.runs > team2.runs) {
            System.out.println(team1.name + " wins by " + (team1.runs - team2.runs) + " runs!");
        } else if (team2.runs > team1.runs) {
            System.out.println(team2.name + " wins by " + (10 - team2.wickets) + " wickets!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

class ODIMatch extends Match {
    public ODIMatch(Team team1, Team team2, Scanner scanner) {
        super(team1, team2, scanner);
    }

    @Override
    void setMatchRules() {
        this.overs = MatchType.ODI.overs;
        System.out.println("This is an ODI match with " + overs + " overs per innings.");
    }
}

class T20Match extends Match {
    public T20Match(Team team1, Team team2, Scanner scanner) {
        super(team1, team2, scanner);
    }

    @Override
    void setMatchRules() {
        this.overs = MatchType.T20.overs;
        System.out.println("This is a T20 match with " + overs + " overs per innings.");
    }
}

class Scoreboard {
    public void displayDetailedScoreboard(Team team) {
        System.out.println("\n--- Detailed Scoreboard for " + team.name + " ---");
        System.out.println("Total: " + team.runs + "/" + team.wickets);
        System.out.println("Extras: " + team.extras.getTotal() + " (Wd " + team.extras.wides + 
                           ", NB " + team.extras.noBalls + ", B " + team.extras.byes + 
                           ", LB " + team.extras.legByes + ")");
        System.out.println("\nBatting:");
        System.out.printf("%-20s %-10s %-10s %-10s %-10s %-10s%n", "Player", "Runs", "Balls", "4s", "6s", "S/R");
        for (Player player : team.players) {
            if (player.ballsFaced > 0) {
                System.out.printf("%-20s %-10d %-10d %-10d %-10d %-10.2f%n", 
                                  player.name, player.runs, player.ballsFaced, player.fours, player.sixes, player.getStrikeRate());
            }
        }
    }

    public void displayScoreboard(Team team) {
        System.out.println("\nScoreboard for " + team.name);
        System.out.println("Total: " + team.runs + "/" + team.wickets);
    }
}

public class CricketGame {
    static final int PLAYERS_PER_TEAM = 11;
    Scanner scanner;
    Team team1;
    Team team2;
    Scoreboard scoreboard;

    public CricketGame() {
        scanner = new Scanner(System.in);
        scoreboard = new Scoreboard();
    }

    public static void main(String[] args) {
        CricketGame game = new CricketGame();
        game.startGame();
    }

    void startGame() {
        System.out.println("Welcome to the Cricket Game!");
        createTeams();
        MatchType matchType = selectMatchType();
        Match match;
        if (matchType == MatchType.ODI) {
            match = new ODIMatch(team1, team2, scanner);
        } else {
            match = new T20Match(team1, team2, scanner);
        }
        match.startMatch();
        displayFinalScoreboard();
    }

    void createTeams() {
        team1 = createTeam("Team 1");
        team2 = createTeam("Team 2");
    }

    Team createTeam(String teamLabel) {
        System.out.println("\n--- Creating " + teamLabel + " ---");
        System.out.print("Enter team name (or press Enter for default): ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            name = "Team " + teamLabel;
        }
        Team team = new Team(name);

        System.out.print("Do you want to enter player names? (Y/N): ");
        boolean enterNames = scanner.nextLine().trim().equalsIgnoreCase("Y");

        for (int i = 1; i <= PLAYERS_PER_TEAM; i++) {
            String playerName;
            if (enterNames) {
                System.out.print("Enter name for player " + i + " (or press Enter for default): ");
                playerName = scanner.nextLine().trim();
            } else {
                playerName = "";
            }
            if (playerName.isEmpty()) {
                playerName = "Player" + i;
            }
            team.addPlayer(new Player(playerName));
        }
        return team;
    }

    MatchType selectMatchType() {
        System.out.println("\n--- Select match type ---");
        System.out.println("1. ODI (50 overs)");
        System.out.println("2. T20 (20 overs)");
        int choice;
        do {
            System.out.print("Enter your choice (1 or 2): ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number. Please try again.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (choice < 1 || choice > 2);
        return choice == 1 ? MatchType.ODI : MatchType.T20;
    }

    void displayFinalScoreboard() {
        System.out.println("\n======= FINAL SCOREBOARD =======");
        scoreboard.displayDetailedScoreboard(team1);
        scoreboard.displayDetailedScoreboard(team2);
    }
}
