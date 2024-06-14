import java.util.Scanner;

public class MatrixMinMaxSum {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values of the 5x5 matrix:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int min = findMin(matrix);
        int max = findMax(matrix);

        int sumMinMax = min + max;

        System.out.println("\nSmallest element in the matrix: " + min);
        System.out.println("Largest element in the matrix: " + max);
        System.out.println("Sum of smallest and largest elements: " + sumMinMax);
    }

    public static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
