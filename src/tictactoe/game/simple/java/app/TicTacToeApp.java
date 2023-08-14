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
public class TicTacToeApp {
    
    // Add scanner object
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Create new board using utility class
        String[][] gameBoard = UtilityClassDisplayBoard.createEmptyBoard();

        // Display empty board ready to be played
        UtilityClassDisplayBoard.displayCurrentBoardState(gameBoard);

        // Create new match TicTacToeMatch class insrance - representing the whole match that will be played
        TicTacToeMatch newMatch = new TicTacToeMatch(gameBoard);

        // Create do while loop - which will call repeatedly makeAMove method untill some one will win
        do {
            newMatch.makeAMove(gameBoard, 0, 0);
        } while (false);
    }
}
