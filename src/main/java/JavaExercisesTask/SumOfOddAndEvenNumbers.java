package JavaExercisesTask;

import Utils.ReadAnArrayFromConsole;

public class SumOfOddAndEvenNumbers {
    private int numberOfEvenElements = 0;
    private int sumOfOddElements = 0;

    public void findSumOfOddElementsAndTotalNumberOfEvenElements() {
        ReadAnArrayFromConsole readAnArrayFromConsole = new ReadAnArrayFromConsole();
        int[] initialArray = readAnArrayFromConsole.readAndPrintIntArrayFromConsole();

        for (int i = 0; i < readAnArrayFromConsole.getNumberOfElementsInArray(); i++) {
            if (initialArray[i] % 2 == 0) {
                numberOfEvenElements++;
            } else {
                sumOfOddElements += initialArray[i];
            }
        }
        System.out.println("\nThe Total Even numbers is: " + numberOfEvenElements);
        System.out.println("\nThe Total Sum of Odd numbers is: " + sumOfOddElements);
    }
}