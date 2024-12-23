package Assignment06;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private char[][] grid;

    // Initializes the board with a 3x3 grid
    public Board() {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' '; // Initialize all cells with empty spaces
            }
        }
    }

    // Displays the current state of the board
    public void displayBoard() {
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
                if (j < 2) System.out.print("|"); // Print column separator
            }
            System.out.println();
            if (i < 2) System.out.println("-----"); // Print row separator
        }
    }

    // Places a marker on the board if the position is valid and empty
    public boolean placeMarker(int row, int col, char marker) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == ' ') {
            grid[row][col] = marker;
            return true;
        }
        return false; // Invalid move
    }

    // Checks if a player has won the game
    public boolean checkWin(char marker) {
        // Check rows and columns for a win
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == marker && grid[i][1] == marker && grid[i][2] == marker) || // Row
                (grid[0][i] == marker && grid[1][i] == marker && grid[2][i] == marker)) { // Column
                return true;
            }
        }
        // Check both diagonals for a win
        return (grid[0][0] == marker && grid[1][1] == marker && grid[2][2] == marker) || // Main diagonal
               (grid[0][2] == marker && grid[1][1] == marker && grid[2][0] == marker);   // Anti-diagonal
    }

    // Returns a list of available cells on the board
    public List<int[]> getAvailableCells() {
        List<int[]> cells = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') {
                    cells.add(new int[]{i, j});
                }
            }
        }
        return cells;
    }


    // Below are used by the smarter computer player

    // Getter for the grid (used by smarter computer)
    public char[][] getGrid() {
        return grid;
    }

    // Simulates placing a marker on the board
    public void simulateMove(int row, int col, char marker) {
        grid[row][col] = marker;
    }

    // Undoes a simulated move (sets the cell back to empty)
    public void undoMove(int row, int col) {
        grid[row][col] = ' ';
    }
}