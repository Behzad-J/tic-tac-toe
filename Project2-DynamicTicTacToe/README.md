# Dynamic Tic-Tac-Toe

This project builds on the Smarter Tic-Tac-Toe game from Project 1 by introducing customizable grid sizes and win conditions. Unlike Project 1, this version does not include the smarter computer player; instead, the computer player uses random move logic. The game is designed to be scalable, supporting grids as large as 20x20.

---

## Features

1. **Customizable Grid Sizes**:
   - Choose a grid size between 3x3 and 20x20.

2. **Custom Win Conditions**:
   - Specify the number of consecutive markers needed to win (e.g., 3 in a row, 4 in a row).

3. **Game Modes**:
   - **Human vs Human (HH)**: Two players alternate turns.
   - **Human vs Computer (HC)**: Play against a computer that selects random moves.
   - **Computer vs Computer (CC)**: Watch two computer players compete.

4. **Reusability**:
   - This project reuses and extends code from the first project, adhering to object-oriented programming principles like modularity and encapsulation.

5. **Dynamic Win Detection**:
   - The game dynamically checks rows, columns, and diagonals based on the chosen win condition.

---

### Prerequisites to Run the Game
- Install Java Development Kit (JDK) 8 or higher.
