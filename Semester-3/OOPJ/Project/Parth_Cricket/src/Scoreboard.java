import java.util.Scanner;

public class Scoreboard {
    private Team team1;
    private Team team2;
    private int totalOvers;

    public Scoreboard(Team team1, Team team2, int overs) {
        this.team1 = team1;
        this.team2 = team2;
        this.totalOvers = overs;
    }

    public void startMatch(Scanner sc) {
        // Run the match for both teams
        System.out.println(team1.getName() + " is batting first.");
        playInnings(team1, sc);

        System.out.println(team2.getName() + " is batting now.");
        playInnings(team2, sc);

        declareWinner();
    }

    // Function to handle an innings
    private void playInnings(Team team, Scanner sc) {
        for (int i = 1; i <= totalOvers; i++) {
            System.out.println("Over " + i + " for " + team.getName());
            int runs = 0;
            int wickets = 0;

            for (int ball = 1; ball <= 6; ball++) {
                int input = 0;

                // Loop to handle invalid inputs
                while (true) {
                    try {
                        System.out.println("Ball " + ball + ": Enter runs (or 0 for wicket, -1 for wide, -2 for no-ball): ");
                        input = sc.nextInt();
                        
                        // Check if input is valid
                        if (input < -2 && input>6) {
                            throw new InvalidRunInputException("Invalid input! Please enter valid runs.");
                        }
                        break; // Exit the loop when valid input is entered
                    } catch (InvalidRunInputException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Invalid input type! Please enter a valid integer.");
                        sc.next(); // Clear the invalid input
                    }
                }

                if (input == -1) {
                    runs += 1;  // Wide ball
                    System.out.println("Wide ball! 1 extra run.");
                } else if (input == -2) {
                    runs += 1;  // No ball + free hit
                    System.out.println("No-ball! 1 extra run.");
                    System.out.println("Free hit! Enter the runs for the next ball: ");
                    runs += sc.nextInt();  // Free hit run
                } else if (input == 0) {
                    wickets++;
                    team.addWicket();
                    System.out.println("Wicket!");
                } else {
                    runs += input;
                }

                if (wickets >= 10) {
                    System.out.println(team.getName() + " is all out!");
                    break;
                }
            }
            team.addRuns(runs);
            displayScore(team);
        }
    }

    // Display score for the current team
    private void displayScore(Team team) {
        System.out.println("Current Score for " + team.getName() + ": " + team.getRuns() + "/" + team.getWickets());
    }

    // Declare the winner
    public void declareWinner() {
        if (team1.getRuns() > team2.getRuns()) {
            System.out.println(team1.getName() + " wins by " + (team1.getRuns() - team2.getRuns()) + " runs!");
        } else if (team2.getRuns() > team1.getRuns()) {
            System.out.println(team2.getName() + " wins by " + (team2.getRuns() - team1.getRuns()) + " runs!");
        } else {
            System.out.println("The match is a tie!");
        }
    }
}
