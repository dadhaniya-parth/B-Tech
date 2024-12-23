import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for team names and match type
        System.out.println("Enter Team 1 Name: ");
        String team1Name = sc.nextLine();

        System.out.println("Enter Team 2 Name: ");
        String team2Name = sc.nextLine();

        System.out.println("Select Match Type (ODI/T20): ");
        String matchType = sc.nextLine();

        // Initialize teams and overs
        Team team1 = new Team(team1Name);
        Team team2 = new Team(team2Name);
        int overs = (matchType.equalsIgnoreCase("T20")) ? 20 : 50;

        // Create scoreboard
        Scoreboard scoreboard = new Scoreboard(team1, team2, overs);

        // Start the match
        scoreboard.startMatch(sc);
        sc.close();
    }
}
