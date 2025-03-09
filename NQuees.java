public class NQuees {
    public static int count = 0;

    public static void nQueens(char[][] board, int row) {
        if (row == board.length) {
            count++;
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place queen
                nQueens(board, row + 1); // Recur for the next row
                board[row][j] = 'x'; // Backtrack
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("--------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check the column above
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int N = 4; // Example for N = 4, change this for different sizes
        char[][] board = new char[N][N];

        // Initialize the board with 'x' (empty spaces)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
        System.out.println("Total solutions: " + count);
    }
}
