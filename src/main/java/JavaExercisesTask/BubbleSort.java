package JavaExercisesTask;

import Utils.PrintArrayElements;
import Utils.ReadAnArrayFromConsole;

public class BubbleSort {
    private int temporaryElement = 0;

    public void sortElementsInArrayBubbleSort() {
        ReadAnArrayFromConsole readAnArrayFromConsole = new ReadAnArrayFromConsole();
        int[] initialArray = readAnArrayFromConsole.readAndPrintIntArrayFromConsole();
        for (int i = 0; i < readAnArrayFromConsole.getNumberOfElementsInArray(); i++) {
            for (int j = 1; j < (readAnArrayFromConsole.getNumberOfElementsInArray() - i); j++) {
                if (initialArray[j - 1] > initialArray[j]) {
                    temporaryElement = initialArray[j - 1];
                    initialArray[j - 1] = initialArray[j];
                    initialArray[j] = temporaryElement;
                }
            }
        }

        System.out.println("\nArray after Bubble sort: ");
        PrintArrayElements.printIntArray(initialArray);
    }
}