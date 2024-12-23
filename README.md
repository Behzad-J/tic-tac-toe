# Tic-Tac-Toe

Welcome to my Tic-Tac-Toe portfolio! This repository showcases two Java-based implementations of the classic Tic-Tac-Toe game, designed to demonstrate my software engineering skills and understanding of object-oriented programming (OOP) principles.

## Table of Contents
1. [Overview](#overview)
2. [Projects](#projects)
   - [Smarter Tic-Tac-Toe](#smarter-tic-tac-toe)
   - [Dynamic Tic-Tac-Toe](#dynamic-tic-tac-toe)
3. [OOP Design Principles Used](#oop-design-principles-used)
4. [Next Steps](#next-steps)
5. [How to Clone and Use](#how-to-clone-and-use)

---

## Overview

This portfolio contains two Java projects:
- **Project 1: Smarter Tic-Tac-Toe**: A 3x3 Tic-Tac-Toe game featuring an intelligent computer player.
- **Project 2: Dynamic Tic-Tac-Toe**: An enhanced version that supports customizable grid sizes and win conditions.

---

## Projects

### Smarter Tic-Tac-Toe
**Description**: A 3x3 Tic-Tac-Toe implementation with a smarter AI opponent that uses heuristic strategies like blocking opponent wins and prioritizing its own.

**Key Features**:
- Game Modes:
  - Human vs Human
  - Human vs Computer
  - Computer vs Computer
- Smarter AI:
  - Blocks opponent’s winning moves.
  - Prioritizes completing its own rows to win.
  - Prefers center and corner positions for strategic advantages.

[Learn More & How to Use](Project1-SmarterTicTacToe/README.md)

---

### Dynamic Tic-Tac-Toe
**Description**: A scalable version of Tic-Tac-Toe with dynamic grid sizes and custom win conditions, allowing the game to be played on grids as large as 20x20.

**Key Features**:
- Customizable grid sizes: From 3x3 to 20x20.
- Adjustable win conditions: Set the number of markers in a row needed to win.
- Game Modes:
  - Human vs Human
  - Human vs Computer
  - Computer vs Computer

[Learn More & How to Use](Project2-DynamicTicTacToe/README.md)

---

## OOP Design Principles Used

### Core OOP Principles:
1. **Encapsulation**:
   - Each class has a specific responsibility (e.g., `Board` manages the grid, `Game` controls the game loop).
   - Implementation details are hidden, ensuring clear public interfaces.

2. **Polymorphism**:
   - The `Player` class is extended to create `HumanPlayer` and `ComputerPlayer`, enabling dynamic behavior.

3. **Open-Closed Principle**:
   - Classes are open to extension (e.g., smarter AI), but their core implementations remain unchanged.

4. **Single Responsibility Principle**:
   - Each class handles a distinct aspect of the game, simplifying maintainability.

5. **Information Hiding**:
   - Internal data structures are private, with controlled access via getter/setter methods.

---

## Next Steps

The next logical improvement is incorporating the smarter computer player logic from Project 1 into the dynamic grid size of Project 2. This involves:
- Extending heuristic strategies to larger grids.
- Optimizing AI performance for 20x20 grids.
- Allowing the AI to adapt to different win conditions.

---

## How to Clone and Use

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Behzad-J/tic-tac-toe.git
   cd tic-tac-toe
