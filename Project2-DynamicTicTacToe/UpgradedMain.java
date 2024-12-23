package Assignment06;

import java.util.Scanner;

public class UpgradedMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gridSize = 0; // Variable to store the grid size (N x N)
        int winCondition = 0; // Variable to store the win condition (M markers in a row)

        // Prompt user for grid size (N) with validation
        while (true) {
            try {
                System.out.println("Enter the grid size (N) (3 <= N <= 20): ");
                gridSize = scanner.nextInt(); // Read grid size input
                if (gridSize < 3 || gridSize > 20) {
                    throw new IllegalArgumentException("Grid size must be between 3 and 20.");
                }
                break; // Valid input; exit loop
            } catch (Exception e) {
                System.out.println("Invalid input. " + e.getMessage());
                scanner.nextLine(); // Clear invalid input buffer
            }
        }

        // Prompt user for win condition (M) with validation
        while (true) {
            try {
                System.out.println("Enter the win condition (M) (M <= N): ");
                winCondition = scanner.nextInt(); // Read win condition input
                if (winCondition < 1 || winCondition > gridSize) {
                    throw new IllegalArgumentException("Win condition must be <= grid size and >= 1.");
                }
                break; // Valid input; exit loop
            } catch (Exception e) {
                System.out.println("Invalid input. " + e.getMessage());
                scanner.nextLine(); // Clear invalid input buffer
            }
        }
        scanner.nextLine(); // Consume the leftover newline character

        // Prompt user for game mode
        System.out.println("Choose game mode: \n1 (Player vs Player)\n2 (Player vs Computer)\n3 (Computer vs Computer): ");
        int mode = scanner.nextInt(); // Read game mode input
        scanner.nextLine(); // Consume the leftover newline character

        Player player1, player2;

        // Configure players based on the selected game mode
        if (mode == 1) {
            // Player vs Player mode
            System.out.print("Enter Player 1's name: ");
            player1 = new HumanPlayer(scanner.nextLine(), 'X', scanner); // Create Player 1

            System.out.print("Enter Player 2's name: ");
            player2 = new HumanPlayer(scanner.nextLine(), 'O', scanner); // Create Player 2
        } else if (mode == 2) {
            // Player vs Computer mode
            System.out.print("Enter Player's name: ");
            player1 = new HumanPlayer(scanner.nextLine(), 'X', scanner); // Create human Player 1

            player2 = new ComputerPlayer("Computer", 'O'); // Create Computer Player 2
        } else {
            // Computer vs Computer mode
            player1 = new ComputerPlayer("Computer 1", 'X'); // Create Computer Player 1
            player2 = new ComputerPlayer("Computer 2", 'O'); // Create Computer Player 2
        }

        // Start the upgraded game with the specified grid size and win condition
        DynamicGame game = new DynamicGame(player1, player2, gridSize, winCondition);
        game.start(); // Begin the game loop

        scanner.close(); // Close the scanner to release resources
    }
}