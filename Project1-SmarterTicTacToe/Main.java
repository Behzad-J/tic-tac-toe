package Assignment06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose the game mode
        System.out.println("Choose game mode: \n1 (Player vs Player)\n2 (Player vs Computer)\n3 (Computer vs Computer): ");
        int mode = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after integer input

        Player player1, player2;

        // Initialize players based on the selected game mode
        if (mode == 1) {
            // Player vs Player mode
            System.out.print("Enter Player 1's name: ");
            player1 = new HumanPlayer(scanner.nextLine(), 'X', scanner);

            System.out.print("Enter Player 2's name: ");
            player2 = new HumanPlayer(scanner.nextLine(), 'O', scanner);
        } else if (mode == 2) {
            // Player vs Computer mode
            System.out.print("Enter Player's name: ");
            player1 = new HumanPlayer(scanner.nextLine(), 'X', scanner);

            player2 = new ComputerPlayer("Computer", 'O');
        } else {
            // Computer vs Computer mode
            player1 = new ComputerPlayer("Computer 1", 'X');
            player2 = new ComputerPlayer("Computer 2", 'O');
        }

        // Create a game instance with the selected players
        Game game = new Game(player1, player2);

        // Start the game loop
        game.start();

        scanner.close(); // Close the scanner resource
    }
}