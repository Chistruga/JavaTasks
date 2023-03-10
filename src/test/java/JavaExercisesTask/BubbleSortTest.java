package JavaExercisesTask;

import Utils.PrintArrayElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
     void testBubleSortMethod() {
        int temporaryElement = 0;
        int[] arrayToTestBubleSort = {11, 2, 5, 22, 1};
        //BubbleSort bubbleSort = new BubbleSort();
        for (int i = 0; i < arrayToTestBubleSort.length; i++) {
            for (int j = 1; j < arrayToTestBubleSort.length; j++) {
                if (arrayToTestBubleSort[j - 1] > arrayToTestBubleSort[j]) {
                    temporaryElement = arrayToTestBubleSort[j - 1];
                    arrayToTestBubleSort[j - 1] = arrayToTestBubleSort[j];
                    arrayToTestBubleSort[j] = temporaryElement;
                }
            }
        }
        int[] arrayToTestBubleSort1 = {1, 2, 5, 11, 22};

//        System.out.println("\nArray after Bubble sort: ");
//        PrintArrayElements.printIntArray(arrayToTestBubleSort);
        assertArrayEquals(arrayToTestBubleSort1, arrayToTestBubleSort);

    }
}