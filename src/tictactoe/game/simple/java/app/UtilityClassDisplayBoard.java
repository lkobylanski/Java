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

    public static void displayWinningSequence(String winningSequence, String winningPlayer) {
        String[][] winningSequenceBoard = new String[3][3];

        for (int i = 0; i < winningSequenceBoard.length; i++) {
            for (int j = 0; j < winningSequenceBoard[i].length; j++) {
                winningSequenceBoard[i][j] = " ";
            }
        }

        switch (winningSequence) {
            case "row1":
                for (int i = 0; i < winningSequenceBoard.length; i++) {
                    winningSequenceBoard[0][i] = winningPlayer;
                }
                break;
            case "row2":
                for (int i = 0; i < winningSequenceBoard.length; i++) {
                    winningSequenceBoard[1][i] = winningPlayer;
                }
                break;
            case "row3":
                for (int i = 0; i < winningSequenceBoard.length; i++) {
                    winningSequenceBoard[2][i] = winningPlayer;
                }
                break;
            case "col1":
                for (int i = 0; i < winningSequenceBoard.length; i++) {
                    winningSequenceBoard[i][0] = winningPlayer;
                }
                break;
            case "col2":
                for (int i = 0; i < winningSequenceBoard.length; i++) {
                    winningSequenceBoard[i][1] = winningPlayer;
                }
                break;
            case "col3":
                for (int i = 0; i < winningSequenceBoard.length; i++) {
                    winningSequenceBoard[i][2] = winningPlayer;
                }
                break;
            case "diag1":
                for (int i = 0; i < winningSequenceBoard.length; i++) {
                    winningSequenceBoard[i][i] = winningPlayer;
                }
                break;
            case "diag2":
                for (int i = 0; i < winningSequenceBoard.length; i++) {
                    winningSequenceBoard[i][winningSequenceBoard.length - 1 - i] = winningPlayer;
                }
                break;
            default:
                System.out.println("Something went wrong. I couldn't display the winning sequence.");
        }
        
        displayCurrentBoardState(winningSequenceBoard);
    }
}
