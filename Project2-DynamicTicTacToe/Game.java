package Assignment06;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.board = new Board();
        this.player1 = player1;
        this.player2 = player2;
    }

    // Main game loop
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            board = new Board(); // Reset board for new game
            boolean isPlayer1Turn = true;
            int moves = 0;

            // Play until the board is full or a player wins
            while (moves < 9) {
                board.displayBoard();
                
                Player currentPlayer;
                if (isPlayer1Turn) {
                    currentPlayer = player1;
                } else {
                    currentPlayer = player2;
                }
                
                System.out.println(currentPlayer.getName() + "'s turn:");
                int[] move = currentPlayer.makeMove(board);

                if (board.placeMarker(move[0], move[1], currentPlayer.getSymbol())) {
                    moves++;
                    if (board.checkWin(currentPlayer.getSymbol())) {
                        board.displayBoard();
                        System.out.println(currentPlayer.getName() + " wins!");
                        break;
                    }
                    isPlayer1Turn = !isPlayer1Turn;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            // If no winner, it's a draw
            if (moves == 9) {
                board.displayBoard();
                System.out.println("It's a draw!");
            }

            System.out.println("Game over! Play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}