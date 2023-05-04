package JavaExercisesTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfOddAndEvenNumbersTest {
    SumOfOddAndEvenNumbers sumOfOddAndEvenNumbers = new SumOfOddAndEvenNumbers();
    public int[] arrayToBeChecked = {2, 3, 4, 5, 6};

    @Test
    void testTheSumOfOddElements() {
        int sumOfOddElements = 8;
        assertEquals(sumOfOddElements, sumOfOddAndEvenNumbers.findSumOfOddElements(arrayToBeChecked));
    }

    @Test
    void testTheTotalNumberOfEvenElements() {
        int evenTotalNumber = 3;
        assertEquals(evenTotalNumber, sumOfOddAndEvenNumbers.findTotalNumberOfEvenElements(arrayToBeChecked));
    }
}