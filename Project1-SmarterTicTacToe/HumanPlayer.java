package Assignment06;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name, char symbol, Scanner scanner) {
        super(name, symbol);
        this.scanner = scanner;
    }

    @Override
    public int[] makeMove(Board board) {
        System.out.println(getName() + ", enter your move as (row,column): ");
        // Read and parse user input
        String input = scanner.nextLine().trim().replaceAll("[()]", "");
        String[] parts = input.split(",");
        int row = Integer.parseInt(parts[0].trim()) - 1; // Convert to zero-based index
        int col = Integer.parseInt(parts[1].trim()) - 1;
        return new int[]{row, col};
    }
}