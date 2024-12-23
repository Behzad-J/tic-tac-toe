# Smarter Tic-Tac-Toe

This project implements a text-based version of Tic-Tac-Toe with two main gameplay variations:
1. A version that features a **Normal Computer Player** capable of random moves.
2. A version that replaces the Normal Computer Player with a **Smarter Computer Player**, which uses heuristic strategies.

The game supports the following modes:
1. **Human vs Human (HH)**: Two players take turns.
2. **Human vs Normal Computer (HC)**: Play against a computer making random moves.
3. **Computer vs Computer (CC)**: Two Normal Computer Players compete.
4. **Human vs Smarter Computer (HS)**: Play against an AI that blocks, prioritizes, and chooses strategic positions.
5. **Smarter Computer vs Smarter Computer (SS)**: Two smarter AIs compete.

The two main classes supporting these variations are:
- **`Main`**: Provides the game modes HH, HC, and CC.
- **`MainSmarterGame`**: Extends functionality to include HS and SS modes with the Smarter Computer Player.

---

## Features

1. **Two Types of Computer Players**:
   - **Normal Computer Player**:
     - Makes random moves without any strategic consideration.
     - Implemented in the `ComputerPlayer` class.
   - **Smarter Computer Player**:
     - Blocks opponent's winning moves.
     - Prioritizes its own winning moves.
     - Prefers center and corners for strategic advantage.
     - Implemented in the `SmarterComputerPlayer` class.

2. **Game Modes**:
   - **Human vs Human (HH)**: Two human players take turns.
   - **Human vs Computer (HC)**: Compete against a Normal Computer Player.
   - **Computer vs Computer (CC)**: Two Normal Computer Players compete.
   - **Human vs Smarter Computer (HS)**: Compete against the smarter AI.
   - **Smarter Computer vs Smarter Computer (SS)**: Watch two smarter AIs compete.

3. **Win Detection**:
   - Automatically detects and announces a winner or a draw after each move.

4. **Interactive Gameplay**:
   - Players input moves using row and column numbers (e.g., `(1,1)` for the top-left cell).

---

### Prerequisites to Run the Game
- Install Java Development Kit (JDK) 8 or higher.

