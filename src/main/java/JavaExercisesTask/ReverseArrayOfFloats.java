package JavaExercisesTask;

import Utils.PrintArrayElements;
import Utils.ReadAnArrayFromConsole;

import java.util.Arrays;

public class ReverseArrayOfFloats {
    PrintArrayElements printArrayElements = new PrintArrayElements();

    public double[] reverseAnArray(double[] arrayToBeReversed) {
        System.out.println("\nReversed array is: ");
        double[] temporaryArray = new double[arrayToBeReversed.length];
        for (int i = arrayToBeReversed.length - 1; i > -1; i--) {
            temporaryArray[arrayToBeReversed.length - i - 1] = arrayToBeReversed[i];
        }
        return temporaryArray;
    }
}