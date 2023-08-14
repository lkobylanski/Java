/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe.game.simple.java.app;

/**
 *
 * @author lukas
 */
public class BoardDisplay {

    String[][] ticTacToeBoard = new String[3][3];

    public BoardDisplay() {
        for (int i = 0; i < this.ticTacToeBoard.length; i++) {
            for (int j = 0; j < this.ticTacToeBoard[i].length; j++) {
                ticTacToeBoard[i][j] = " ";
            }
        }
    }

    public String[][] getCurrentBoard() {
        return this.ticTacToeBoard;
    }

    public String[][] setCurrentBoard(String[][] ticTacToeBoard) {
        this.ticTacToeBoard = ticTacToeBoard;
        
        return this.ticTacToeBoard;
    }

    public void displayCurrentBoardState() {
        System.out.println();
        System.out.println();

        for (int i = 0; i < this.ticTacToeBoard.length; i++) {
            for (int j = 0; j < this.ticTacToeBoard[i].length; j++) {
                System.out.print(this.ticTacToeBoard[i][j]);
                if (j < this.ticTacToeBoard[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < this.ticTacToeBoard.length - 1) {
                System.out.println("---------");
            }
        }
    }
}
