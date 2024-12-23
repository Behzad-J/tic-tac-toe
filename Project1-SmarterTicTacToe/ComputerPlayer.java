package Assignment06;

import java.util.List;
import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name, char symbol) {
        super(name, symbol);
        this.random = new Random();
    }

    @Override
    public int[] makeMove(Board board) {
        List<int[]> availableCells = board.getAvailableCells(); // Get list of empty cells
        return availableCells.get(random.nextInt(availableCells.size())); // Choose randomly
    }
}