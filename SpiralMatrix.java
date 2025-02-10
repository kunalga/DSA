public class SpiralMatrix {
    public static void spiralMatrix(int[][] arr) {
        int startCol = 0;
        int endCol = arr[0].length - 1;
        int startRow = 0;
        int endRow = arr.length - 1;

        while (startCol <= endCol && startRow <= endRow) {
            // Print top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            startRow++; // Move down the row

            // Print right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--; // Move left column boundary

            // Print bottom row (if not already printed)
            if (startRow <= endRow)  {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
                endRow--; // Move up the row boundary
            }

            // Print left column (if not already printed)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
                startCol++; // Move right column boundary
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiralMatrix(arr);
    }
}
