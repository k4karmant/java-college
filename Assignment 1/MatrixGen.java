import java.util.Random;

public class MatrixGen {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(6, 6);
        displayMatrix(matrix);

        System.out.println("\nRows with an odd number of 1's:");
        displayRowsWithOddOnes(matrix);

        System.out.println("\nColumns with an odd number of 1's:");
        displayColumnsWithOddOnes(matrix);
    }

    public static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(2); // Generates either 0 or 1
            }
        }

        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void displayRowsWithOddOnes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int countOnes = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }

            if (countOnes % 2 != 0) {
                displayRow(matrix, i);
            }
        }
    }

    public static void displayColumnsWithOddOnes(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int countOnes = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }

            if (countOnes % 2 != 0) {
                displayColumn(matrix, j);
            }
        }
    }

    public static void displayRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[row].length; j++) {
            System.out.print(matrix[row][j] + " ");
        }
        System.out.println();
    }

    public static void displayColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][column]);
        }
        System.out.println();
    }
}
