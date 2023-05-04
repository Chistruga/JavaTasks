package JavaExercisesTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();
    @Test
    void testBubbleSort() {
        int[] testArray = {11, 5, 2, 7, 111, 0};
        int[] sorted = {0, 2, 5, 7, 11, 111};

        assertArrayEquals(sorted,bubbleSort.sortElementsInArrayBubbleSort(testArray));
    }
}