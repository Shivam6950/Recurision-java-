public class Sudoku {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check for row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        // Check for column
        for (char[] chars : board) {         //Same way for (int i = 0; i < board.length; i++)
            if (chars[col] == (char) (number + '0')) {  //if (board[i][col] == (char) (number + '0'))
                return false;
            }
        }

        // Check for 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        // Base case: If we've reached the end of the board, it's solved
        if (row == board.length) {
            return true;
        }

        // Move to the next cell
        int nextRow = (col == board.length - 1) ? row + 1 : row;  //condition ? value_if_true : value_if_false;
        int nextCol = (col == board.length - 1) ? 0 : col + 1;

        // If the current cell is already filled, skip it
        if (board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        // Try placing numbers 1-9 in the current cell
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = (char) (num + '0'); // Place the number
                if (helper(board, nextRow, nextCol)) { // Recur
                    return true;
                }
                board[row][col] = '.'; // Backtrack
            }
        }

        return false; // If no number works, return false
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Original Sudoku:");
        printBoard(board);

        sudoku.solveSudoku(board);

        System.out.println("Solved Sudoku:");
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

