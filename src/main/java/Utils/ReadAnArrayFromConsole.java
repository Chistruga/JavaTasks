package Utils;

import java.util.Scanner;

public class ReadAnArrayFromConsole {
    private int numberOfElementsInArray;

    public int getNumberOfElementsInArray() {
        return numberOfElementsInArray;
    }

    public int[] readAndPrintIntArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number of elements in the array: ");
        numberOfElementsInArray = scanner.nextInt();

        System.out.println("Enter the elements for your array:");
        int[] initialArray = new int[numberOfElementsInArray];
        for (int i = 0; i < numberOfElementsInArray; i++) {
            initialArray[i] = scanner.nextInt();
        }
        System.out.println("Your initial array is: ");
        PrintArrayElements.printIntArray(initialArray);
        return initialArray;
    }

    public double[] readAndPrintDoubleArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number of elements in the array: ");
        numberOfElementsInArray = scanner.nextInt();

        System.out.println("Enter the elements for your array:");
        double[] initialArray = new double[numberOfElementsInArray];
        for (int i = 0; i < numberOfElementsInArray; i++) {
            initialArray[i] = scanner.nextDouble();
        }
        System.out.println("Your initial array is: ");
        PrintArrayElements.printDoubleArray(initialArray);
        return initialArray;
    }
}