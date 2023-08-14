/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe.game.simple.java.app;

/**
 *
 * @author lukas
 */
public class UtilityClassDisplayBoard {
    
    private UtilityClassDisplayBoard() {
        // Private constructor to prevent instantiation of the utility class
    }

    public static String[][] createEmptyBoard() {
        String[][] ticTacToeBoard = new String[3][3];
        
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                ticTacToeBoard[i][j] = " ";
            }
        }
        return ticTacToeBoard;
    }

    public static void displayCurrentBoardState(String[][] ticTacToeBoard) {
        System.out.println();
        System.out.println();

        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                System.out.print(ticTacToeBoard[i][j]);
                if (j < ticTacToeBoard[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < ticTacToeBoard.length - 1) {
                System.out.println("---------");
            }
        }
    }
}
