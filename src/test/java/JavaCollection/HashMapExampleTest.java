package JavaCollection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HashMapExampleTest {
    HashMapExample hashMapExample = new HashMapExample();
    HashMap<String, Object> hashMap = new HashMap<>();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        hashMap.put("First", 1);
        hashMap.put("Second", "Two");
        hashMap.put("Third", 3.3);
        hashMap.put("Fourth", false);
    }

    @Test
    void testCreateAndReturnHashMap() {
        assertEquals(hashMap, hashMapExample.createAndReturnHashMap());
    }

    @Test
    void testDisplayHashMapKeys() {
        hashMapExample.displayHashMapKeys();
        assertEquals("\n\nHash Map Keys are: [Second, Third, First, Fourth]", outputStreamCaptor.toString());
    }

    @Test
    void testDisplayHashMapValues() {
        hashMapExample.displayHashMapValues();
        assertEquals("\nHash Map Values are: [Two, 3.3, 1, false]", outputStreamCaptor.toString());
    }

    @Test
    void testSetValueForSecondKey() {
        hashMapExample.setValueForSecondKey(hashMap);
        assertEquals("\nNew Map Values are: \n" +
                "Key - Second; Value - NotSecond\n" +
                "Key - Third; Value - 3.3\n" +
                "Key - First; Value - 1\n" +
                "Key - Fourth; Value - false", outputStreamCaptor.toString());
    }

    @Test
    void testRemoveValueOfThirdKey() {
        hashMapExample.removeValueOfThirdKey(hashMap);
        assertEquals("\nNew Map Values are: \n" +
                "Key - Second; Value - Two\n" +
                "Key - Third; Value - null\n" +
                "Key - First; Value - 1\n" +
                "Key - Fourth; Value - false", outputStreamCaptor.toString());
    }

    @Test
    void testPrintMapValues(){
        hashMapExample.printMapValues(hashMap);
        assertEquals("\nHashMap elements iterated using a separate method: \n" +
                "Key - Second, Value - Two\n" +
                "Key - Third, Value - 3.3\n" +
                "Key - First, Value - 1\n" +
                "Key - Fourth, Value - false", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}