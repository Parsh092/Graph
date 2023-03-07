import java.util.*;

public class N_QUEENS {

    public static boolean isSafe(int row, int column, char[][] board) {
        // for row
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }

        // for column
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }


        int r = row;
        int c = column;

        // Upper left
        for (int i = column; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        c = column;

        //upper right
        for (int i = column; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        c = column;

        //Lower left
        for (int i = column; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        c = column;
        // Bottom right
        for (int i = column; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveboard(char[][] board, List<List<String>> allboard) {
        String row = "";
        List<String> newboard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'Q') {
                    row += "Q";
                } else {
                    row += '.';
                }
            }
            System.out.println();
            newboard.add(row);
        }
        allboard.add(newboard);
    }


    // It is the recursive function in which the backtracking will done
    public static void helper(char[][] board, List<List<String>> allboard, int col) {
        if (col == board.length) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            saveboard(board, allboard);
            return;
        }


        // if we are not at the last column of the board
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allboard, col + 1);
                board[row][col] = '.';
            }
        }
    }
    public static void main(String[] args) {
        List<List<String>> allboard = new ArrayList<>();
        char[][] board = new char[4][4];
        helper(board, allboard, 0);

//        SolveQueen(4);
    }

}
