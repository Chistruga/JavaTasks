package JavaExercisesTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicalSquareTest {
    MagicalSquare magicalSquare = new MagicalSquare();

    @Test
    void testAMatrixWhichIsMagicalSquare() {
        int[][] matrix = {{1, 1},
                {1, 1}};
        assertTrue(magicalSquare.checkIfMatrixIsMagic(matrix));
    }

    @Test
    void testAMatrixWhichIsNotAMagicalSquare() {
        int[][] matrix = {{1, 2},
                {3, 4}};
        assertFalse(magicalSquare.checkIfMatrixIsMagic(matrix));
    }
}