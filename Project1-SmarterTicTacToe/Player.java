package Assignment06;

// Abstract class representing a player
public abstract class Player {
    private String name; // Player's name
    private char symbol; // Player's symbol ('X' or 'O')

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    // Abstract method to determine the player's next move
    public abstract int[] makeMove(Board board);
}