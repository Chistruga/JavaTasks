package JavaExercisesTask;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayOfFloatsTest {
    ReverseArrayOfFloats reverseArrayOfFloats = new ReverseArrayOfFloats();

    @Test
    void testArrayReversing() {
        double[] arrayToBeReversed = {1, 2, 3};
        double[] reversedArray = {3, 2, 1};

        assertArrayEquals(reversedArray, reverseArrayOfFloats.reverseAnArray(arrayToBeReversed));
    }

}