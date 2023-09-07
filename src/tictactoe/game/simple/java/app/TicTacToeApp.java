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
    
    // Set winning condition
    static boolean thereIsAWinner = false;
            
    // Add scanner object
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Create new board using utility class
        String[][] gameBoard = UtilityClassDisplayBoard.createEmptyBoard();

        // Display empty board ready to be played
        UtilityClassDisplayBoard.displayCurrentBoardState(gameBoard);

        // Create new match TicTacToeMatch class insrance - representing the whole match that will be played
        TicTacToeMatch newMatch = new TicTacToeMatch(gameBoard);

        // Create do while loop - which will call repeatedly makeAMoveand and checkIfThereIsWinner methods untill some one will win
        do {
            newMatch.makeAMove(gameBoard);
            thereIsAWinner = newMatch.checkIfThereIsWinner();
        } while (!thereIsAWinner);
        
        System.out.println();
        System.out.println(String.format("!!!  GAME OVER !!!\n\nThe winning player is: the player %s. \nCongratulations!", newMatch.isWinner));
        System.out.println();
        System.out.println("* * * * * *");
        System.out.println();
        System.out.println(String.format("The winning sequence achived by the player %s is: ", newMatch.isWinner));
        
        // Winning sequence and the winner are set by the makeAMove method in an instance of TicTacToeMatch - newMatch in our case
        // Those object properties are passed as arguments to utilty calss to clearly display winning sequence
        UtilityClassDisplayBoard.displayWinningSequence(newMatch.winningSequence, newMatch.isWinner);
        
        System.out.println();
        System.out.println("Thank you for playing! :)");
    }
}
