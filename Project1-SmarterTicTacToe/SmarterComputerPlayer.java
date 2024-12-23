package Assignment06;

import java.util.List;

public class SmarterComputerPlayer extends Player {

    public SmarterComputerPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public int[] makeMove(Board board) {
        char[][] grid = board.getGrid();

        // Try to find a winning move
        int[] winMove = findWinningMove(board, getSymbol());
        if (winMove != null) return winMove;

        // Try to block opponent's winning move
        char opponentSymbol = (getSymbol() == 'X') ? 'O' : 'X';
        int[] blockMove = findWinningMove(board, opponentSymbol);
        if (blockMove != null) return blockMove;

        // Play in the center if available
        if (grid[1][1] == ' ') return new int[]{1, 1};

        // Take a corner if available
        int[][] corners = {{0, 0}, {0, 2}, {2, 0}, {2, 2}};
        for (int[] corner : corners) {
            if (grid[corner[0]][corner[1]] == ' ') return corner;
        }

        // Default to random move
        List<int[]> availableCells = board.getAvailableCells();
        return availableCells.get(new java.util.Random().nextInt(availableCells.size()));
    }

    // Finds a winning move for the given symbol
    private int[] findWinningMove(Board board, char symbol) {
        List<int[]> availableCells = board.getAvailableCells();
        for (int[] cell : availableCells) {
            int row = cell[0], col = cell[1];
            board.simulateMove(row, col, symbol);
            if (board.checkWin(symbol)) {
                board.undoMove(row, col);
                return cell; // Found a winning move
            }
            board.undoMove(row, col);
        }
        return null; // No winning move found
    }
}