

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for matrix1[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for matrix2[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Result of matrix addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
