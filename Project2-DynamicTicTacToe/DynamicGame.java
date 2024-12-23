package Assignment06;

public class DynamicGame extends Game {
    private int gridSize; // Size of the dynamic grid
    private int winCondition; // Number of consecutive markers required to win

    // Local references to players (because player1 and player2 in Game are private)
    private Player localPlayer1;
    private Player localPlayer2;

    public DynamicGame(Player player1, Player player2, int gridSize, int winCondition) {
        super(player1, player2); // Call parent constructor
        this.localPlayer1 = player1;
        this.localPlayer2 = player2;
        this.gridSize = gridSize; // Initialize grid size
        this.winCondition = winCondition; // Initialize win condition
    }

    // Local accessors for players
    public Player getPlayer1() {
        return localPlayer1;
    }

    public Player getPlayer2() {
        return localPlayer2;
    }

    @Override
    public void start() {
        DynamicBoard board = new DynamicBoard(gridSize); // Create a dynamic board

        boolean playAgain = true;

        while (playAgain) {
            boolean isPlayer1Turn = true;
            int moves = 0;

            while (moves < gridSize * gridSize) { // Loop until all cells are filled or a win occurs
                board.displayBoard();
                Player currentPlayer = isPlayer1Turn ? getPlayer1() : getPlayer2();
                System.out.println(currentPlayer.getName() + "'s turn");

                int[] move = currentPlayer.makeMove(board);

                if (board.placeMarker(move[0], move[1], currentPlayer.getSymbol())) {
                    moves++;
                    if (board.checkWin(currentPlayer.getSymbol(), winCondition)) { // Check for win condition
                        board.displayBoard();
                        System.out.println(currentPlayer.getName() + " wins!");
                        break;
                    }
                    if (moves == gridSize * gridSize) { // Check for a draw
                        board.displayBoard();
                        System.out.println("It's a draw!");
                        break;
                    }
                    isPlayer1Turn = !isPlayer1Turn; // Switch turns
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            System.out.println("Game over! Do you want to play again? (yes/no): ");
            playAgain = new java.util.Scanner(System.in).nextLine().trim().equalsIgnoreCase("yes");

            if (playAgain) {
                board = new DynamicBoard(gridSize); // Reset the board for a new game
            }
        }
    }
}