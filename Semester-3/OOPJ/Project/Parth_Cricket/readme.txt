Folders :

1. src (for source code)
Main.java (handles user input and main game logic)
Team.java (represents a team with players, runs, and wickets)
Over.java (handles the operations for each over)
Scoreboard.java (displays the scores and match results)

Object-Oriented Concepts Covered:

1. Class and Object: Separate classes for Team, Over, and Scoreboard.
2. Inheritance: The main logic class (e.g., Match) can inherit from a base class for common cricket functionalities.
3. Polymorphism: Method overloading and overriding in classes like Over.
4. Encapsulation: Data for teams, overs, and scores is hidden using private access modifiers.
5. Abstraction: Using abstract classes or interfaces for common behaviors across match types (e.g., ODI, T20).
6. Exception Handling: Custom exception UserDefinedException for handling invalid inputs such as no-balls, wide balls, and match type selection.

How the Project Will Work:

1. Team Input: The user will be prompted to enter team names and match type (ODI or T20).
2. Overs and Runs: After each over, the user enters runs, wickets, and extra details (wide-ball, no-ball).
3. Score Display: The scoreboard will update after every over, showing the current scores.
4. Result Calculation: At the end, the program will calculate the winning team and display detailed match statistics.

This project includes:

Main game logic (Main.java)
Team management (Team.java)
Over handling (Over.java)
Scoreboard management (Scoreboard.java)
A custom user-defined exception (InvalidRunInputException) ​