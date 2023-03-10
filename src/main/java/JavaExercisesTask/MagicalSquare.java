package JavaExercisesTask;

import java.util.Scanner;

public class MagicalSquare {
    private int matrixDimension = 2;
    private int numberOfRows = 2;
    private int numberOfColumns = 2;
    private int matrix[][] = new int[numberOfRows][numberOfColumns];

    public void readMatrixFromConsoleAndSeeIfItIsMagic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the elements for two dimensional matrix: ");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix elements are: ");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print("[" + matrix[i][j] + "]" + " ");
            }
            System.out.println();
        }
        if (checkIfMatrixIsMagic(matrix)) {
            System.out.println("Entered Matrix is MAGIC!");
        } else {
            System.out.println("Entered Matrix is not magic!");
        }
    }

    public boolean checkIfMatrixIsMagic(int matrix[][]) {
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

        for (int d = 0; d < matrixDimension; d++) {
            diagonalSum1 += matrix[d][d];
            diagonalSum2 += matrix[d][matrixDimension - 1 - d];
        }

        if (diagonalSum1 != diagonalSum2) return false;

        for (int i = 0; i < matrixDimension; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < matrixDimension; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != colSum || colSum != diagonalSum1) return false;
        }
        return true;
    }
}