import javax.swing.*;
import java.util.Arrays;

public class XO_Game2 {

    enum Player {PLAYER1, PLAYER2}

    public static void main(String[] args) {

        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], '_');
        }

        Player currentPlayer = Player.PLAYER1;
        char currentPlayerMark = 'X';

        boolean isPlayerWon = false;
        int numberOfEmptyCells = 9;

        while (!isPlayerWon && numberOfEmptyCells > 0) {

            String strRow = JOptionPane.showInputDialog("Please enter row(0-2)");
            String strCol = JOptionPane.showInputDialog("Please enter col(0-2)");

            int row = Integer.parseInt(strRow);
            int col = Integer.parseInt(strCol);

            if (isValidPosition(row, col, board)) {

                board[row][col] = currentPlayerMark;
                numberOfEmptyCells--;
                printBoard(board);

                if (isCurrentPlayerWon(board, currentPlayerMark)) {
                    isPlayerWon = true;
                }
                else {
                    if (currentPlayer == Player.PLAYER1) {
                        currentPlayer = Player.PLAYER2;
                        currentPlayerMark = 'O';
                    }
                    else {
                        currentPlayer = Player.PLAYER1;
                        currentPlayerMark = 'X';
                    }
                }
            }
        }
        if (isPlayerWon) {
            System.out.println(currentPlayer + " has won");
        }
        else {
            System.out.println("nobody won");
        }
    }

    private static boolean isCurrentPlayerWon(char[][] board, char mark) {

        for (int row = 0; row < 3; row++) {
            if (board[row][0] == mark && board[row][1] == mark && board[row][2] == mark) {
                return true;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == mark && board[1][col] == mark && board[2][col] == mark) {
                return true;
            }
        }
        if (board[1][1] == mark) {
            if (board[0][0] == mark && board[2][2] == mark) {
                return true;
            }
            if (board[2][0] == mark && board[0][2] == mark) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidPosition(int row, int col, char[][] board) {

        if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '_') {
            return false;
        }
        return true;
    }

    private static void printBoard(char[][] board) {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
