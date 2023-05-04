package JavaExercisesTask;

import Utils.ReadAnArrayFromConsole;

public class SumOfOddAndEvenNumbers {
    private int numberOfEvenElements = 0;
    private int sumOfOddElements = 0;

    public int findSumOfOddElements(int[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] % 2 != 0) {
                sumOfOddElements += givenArray[i];
            }
        }
        return sumOfOddElements;
    }

    public int findTotalNumberOfEvenElements(int[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            if (i % 2 == 0) {
                numberOfEvenElements++;
            }
        }
        return numberOfEvenElements;
    }
}