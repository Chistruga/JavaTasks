package JavaExercisesTask;

import Utils.PrintArrayElements;
import Utils.ReadAnArrayFromConsole;

public class BubbleSort {
    private int temporaryElement = 0;
    public int[] sortElementsInArrayBubbleSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 1; j < (arrayToSort.length - i); j++) {
                if (arrayToSort[j - 1] > arrayToSort[j]) {
                    temporaryElement = arrayToSort[j - 1];
                    arrayToSort[j - 1] = arrayToSort[j];
                    arrayToSort[j] = temporaryElement;
                }
            }
        }
    return arrayToSort;
    }
}