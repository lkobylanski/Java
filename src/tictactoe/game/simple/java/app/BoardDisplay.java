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

    public void setBoardState(String player, int row, int column) {
        this.ticTacToeBoard[row][column] = player;
        displayCurrentBoardState();
    }
    
    public static void main(String[] args) {
        BoardDisplay newBoard = new BoardDisplay();
        
        newBoard.displayCurrentBoardState();

        newBoard.setBoardState("X", 1, 1);
    }
}
