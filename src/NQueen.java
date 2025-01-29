public class NQueen {
        static final int N = 4; // Board size

        public static boolean isSafe(int[][] board, int row, int col) {

            // Check the row on the left side
            for (int i = 0; i < col; i++) {
                if (board[row][i] == 1) {
                    return false;
                }
            }

            // Check the upper left diagonal
            for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 1) {
                    return false;
                }
            }

            // Check the lower left diagonal
            for (int i = row, j = col; i < N && j >= 0; i++, j--) {
                if (board[i][j] == 1) {
                    return false;
                }
            }

            return true; // Safe to place a queen
        }

        public static void printBoard(int[][] board) {
            for (int[] row : board) {
                for (int cell : row) {
                    System.out.print(cell == 1 ? "Q " : ". ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static boolean solveNQueen(int[][] board, int col) {
            if (col >= N) {
                printBoard(board);
                return true;
            }
            boolean success = false;
            for (int i = 0; i < N; i++) {
                if (isSafe(board, i, col)) {
                    board[i][col] = 1;

                    // Recur to place the rest of the queens
                    success = solveNQueen(board, col + 1) || success;

                    // Backtrack
                    board[i][col] = 0;
                }
            }
            return success;
        }

        public static void main(String[] args) {
            int[][] board = new int[N][N];
            if (!solveNQueen(board, 0)) {
                System.out.println("No solution exists");
            }
        }
    }