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
    // Add scanner object

    static Scanner input = new Scanner(System.in);

    String playerO = "O";
    String playerX = "X";
    String currentPlayer = playerO;
    String[][] ticTacToeBoard;
    String isWinner = null;

    public TicTacToeMatch(String[][] ticTacToeBoard) {
        this.ticTacToeBoard = ticTacToeBoard;

        System.out.println("New tic tac toe game started. First player will be using O symbol, second X symbol");
        System.out.println("Player who would 1st set their symbol in a row, column or diagonally will win!");
        System.out.println("Have fun! :)");
    }

    public void setBoardState(int row, int column) {
        this.ticTacToeBoard[row][column] = this.currentPlayer;
    }

    public String[][] makeAMove(String[][] currentBoard, int row, int columns) {
        int playerInputRow;
        int playerInputCol;

        System.out.println(String.format(
                "Now player %s please make a move. Please first enter a row number in range 1 - 3 then the same for the columns. Remeber you can only select empty fields.",
                this.currentPlayer
        ));

        // Validate if field is already taken
        do {
            // Validate player row input value
            do {
                System.out.println();
                System.out.println("Now enter a row number you want to make your move:");

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

            if (currentBoard[playerInputRow][playerInputCol].equalsIgnoreCase("X") || currentBoard[playerInputRow][playerInputCol].equalsIgnoreCase("Y")) {
                System.out.println("The field is already taken! Try to pick another field.");
            }
        } while (currentBoard[playerInputRow][playerInputCol].equalsIgnoreCase("X") || currentBoard[playerInputRow][playerInputCol].equalsIgnoreCase("Y"));

        // If all conditions  was fulfilled set the X or O value at the selected field
        currentBoard[playerInputRow][playerInputCol] = this.currentPlayer;

        //Check if player won the game
        
        
        
        if (this.currentPlayer.equals(playerO)) {
            this.currentPlayer = playerX;
        } else {
            this.currentPlayer = playerO;
        }

        return currentBoard;
    }
}
