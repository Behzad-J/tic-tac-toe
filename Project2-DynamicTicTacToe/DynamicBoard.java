package Assignment06;

import java.util.ArrayList;
import java.util.List;

public class DynamicBoard extends Board {
    private int size; // Size of the grid (N x N)
    private char[][] grid; // Dynamically sized grid

    public DynamicBoard(int size) {
        this.size = size; // Initialize grid size
        grid = new char[size][size]; // Create grid based on size
        // Initialize all cells to empty spaces
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    @Override
    public void displayBoard() {
        System.out.println("\n");
        // Display the board dynamically based on its size
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j]);
                if (j < size - 1) System.out.print("|"); // Print column separator
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("-".repeat(2 * size - 1)); // Print row separator
            }
        }
    }

    @Override
    public boolean placeMarker(int row, int col, char marker) {
        // Place a marker if the cell is valid and empty
        if (row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == ' ') {
            grid[row][col] = marker;
            return true;
        }
        return false; // Invalid move
    }

    @Override
    public List<int[]> getAvailableCells() {
        // Find all empty cells in the grid
        List<int[]> cells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == ' ') {
                    cells.add(new int[]{i, j});
                }
            }
        }
        return cells;
    }

    public boolean checkWin(char marker, int winCondition) {
        // Check rows, columns, and diagonals for a win condition
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size - winCondition; j++) {
                // Check each row and column for the win condition
                if (checkRow(i, j, marker, winCondition) || checkColumn(j, i, marker, winCondition)) {
                    return true;
                }
            }
        }
        // Check diagonals for the win condition
        for (int i = 0; i <= size - winCondition; i++) {
            for (int j = 0; j <= size - winCondition; j++) {
                if (checkDiagonal(i, j, marker, winCondition) || checkAntiDiagonal(i, j, marker, winCondition)) {
                    return true;
                }
            }
        }
        return false; // No win found
    }

    private boolean checkRow(int row, int colStart, char marker, int winCondition) {
        // Check a segment of a row for the win condition
        for (int j = colStart; j < colStart + winCondition; j++) {
            if (grid[row][j] != marker) return false;
        }
        return true;
    }

    private boolean checkColumn(int rowStart, int col, char marker, int winCondition) {
        // Check a segment of a column for the win condition
        for (int i = rowStart; i < rowStart + winCondition; i++) {
            if (grid[i][col] != marker) return false;
        }
        return true;
    }

    private boolean checkDiagonal(int rowStart, int colStart, char marker, int winCondition) {
        // Check a main diagonal for the win condition
        for (int i = 0; i < winCondition; i++) {
            if (grid[rowStart + i][colStart + i] != marker) return false;
        }
        return true;
    }

    private boolean checkAntiDiagonal(int rowStart, int colStart, char marker, int winCondition) {
        // Check an anti-diagonal for the win condition
        for (int i = 0; i < winCondition; i++) {
            if (grid[rowStart + i][colStart + winCondition - 1 - i] != marker) return false;
        }
        return true;
    }
}