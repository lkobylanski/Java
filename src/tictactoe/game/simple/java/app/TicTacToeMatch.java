/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe.game.simple.java.app;

import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class TicTacToeMatch {

    boolean result;

    // Add scanner object
    static Scanner input = new Scanner(System.in);

    String playerO = "O";
    String playerX = "X";
    String currentPlayer = playerO;
    String[][] ticTacToeBoard;
    String isWinner = null;
    String winningSequence;

    public TicTacToeMatch(String[][] ticTacToeBoard) {
        this.ticTacToeBoard = ticTacToeBoard;

        System.out.println();
        System.out.println("New tic tac toe game started. First player will be using O symbol, second X symbol");
        System.out.println("Player who would 1st set their symbol in a row, column or diagonally will win!");
        System.out.println("Have fun! :)");
    }

    public void makeAMove(String[][] currentBoard) {
        int playerInputRow;
        int playerInputCol;

        System.out.println();
        System.out.println(String.format(
                "Payer %s is making a move. Note: Please first enter a row number in range 1 - 3 then do the same for the columns. Remeber you can only select empty fields.",
                this.currentPlayer
        ));

        // Validate if field is already taken
        do {
            // Validate player row input value
            do {
                System.out.println();
                System.out.println("Please enter a row number you want to make your move:");

                while (!input.hasNextInt()) {
                    String invalidInput = input.next();
                    System.out.println(invalidInput + " is not a valid Int. Please enter a positive int value in range 1 - 3: ");
                    input.next(); // Clear the invalid input
                }

                playerInputRow = input.nextInt();

                if (playerInputRow < 1 || playerInputRow > 3) {
                    System.out.println("Input is not in the range 1-3. Please try again.");
                }
            } while (playerInputRow < 1 || playerInputRow > 3);

            // Validate player column input value
            do {
                System.out.println();
                System.out.println("Now enter a column number you want to make your move:");

                while (!input.hasNextInt()) {
                    String invalidInput = input.next();
                    System.out.println(invalidInput + " is not a valid Int. Please enter a positive int value in range 1 - 3: ");
                    input.next(); // Clear the invalid input
                }

                playerInputCol = input.nextInt();

                if (playerInputCol < 1 || playerInputCol > 3) {
                    System.out.println("Input is not in the range 1-3. Please try again.");
                }
            } while (playerInputCol < 1 || playerInputCol > 3);

            if (currentBoard[playerInputRow - 1][playerInputCol - 1].equalsIgnoreCase("X") || currentBoard[playerInputRow - 1][playerInputCol - 1].equalsIgnoreCase("O")) {
                System.out.println("The field is already taken! Try to pick another field.");
            }
        } while (currentBoard[playerInputRow - 1][playerInputCol - 1].equalsIgnoreCase("X") || currentBoard[playerInputRow - 1][playerInputCol - 1].equalsIgnoreCase("O"));

        // If all conditions  was fulfilled set the X or O value at the selected field
        currentBoard[playerInputRow - 1][playerInputCol - 1] = this.currentPlayer;
        this.ticTacToeBoard = currentBoard;

        // Display board state after move was made
        UtilityClassDisplayBoard.displayCurrentBoardState(this.ticTacToeBoard);

        // Check if player won the game     
        // Check rows  
        for (int i = 0; i < 3; i++) {
            if (currentBoard[i][0].equals(this.currentPlayer) && currentBoard[i][1].equals(this.currentPlayer) && currentBoard[i][2].equals(this.currentPlayer)) {
                this.isWinner = this.currentPlayer;
                this.winningSequence = "row" + (i + 1);
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (currentBoard[0][i].equals(this.currentPlayer) && currentBoard[1][i].equals(this.currentPlayer) && currentBoard[2][i].equals(this.currentPlayer)) {
                this.isWinner = this.currentPlayer;
                this.winningSequence = "col" + (i + 1);
            }
        }

        // Check diagonals
        if (currentBoard[0][0].equals(this.currentPlayer) && currentBoard[1][1].equals(this.currentPlayer) && currentBoard[2][2].equals(this.currentPlayer)) {
            this.isWinner = this.currentPlayer;
            this.winningSequence = "diag1";
        }
        if (currentBoard[0][2].equals(this.currentPlayer) && currentBoard[1][1].equals(this.currentPlayer) && currentBoard[2][0].equals(this.currentPlayer)) {
            this.isWinner = this.currentPlayer;
            this.winningSequence = "diag2";
        }
    }

    public boolean checkIfThereIsWinner() {
        boolean someoneWon = false;

        if (this.isWinner != null && this.isWinner.equals(this.currentPlayer)) {
            someoneWon = true;
        } else {
            if (this.currentPlayer.equals(playerO)) {
                this.currentPlayer = playerX;
            } else {
                this.currentPlayer = playerO;
            }
        }
        return someoneWon;
    }
}
