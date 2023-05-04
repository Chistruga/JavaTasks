package JavaCollection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class HashSetExampleTest {
    HashSetExample hashSetExample = new HashSetExample();
    HashSet<Integer> exampleSet = new HashSet<>();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

        for (int i = 0; i <= 10; i++) {
            exampleSet.add(i);
        }
    }

    @Test
    void testCreateAndReturnHashSet(){
        assertEquals(exampleSet, hashSetExample.createAndReturnHashSet());
    }

    @Test
    void testDetermineHashSetSize(){
        hashSetExample.determineHashSetSize(hashSetExample.createAndReturnHashSet());
        assertEquals("\n\nHashSet size is: 11", outputStreamCaptor.toString());
    }

    @Test
    void testIterateHashSetElements(){
        hashSetExample.iterateHashSetElements(hashSetExample.createAndReturnHashSet());
        assertEquals("\nHashSet elements are: 0 1 2 3 4 5 6 7 8 9 10", outputStreamCaptor.toString());
    }

    @Test
    void testDetermineTotalMultipliedElements(){
        hashSetExample.determineTotalMultipliedElements(hashSetExample.createAndReturnHashSet());
        assertEquals("\nTotal Multiplied Even elements is: 3840", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}