package JavaCollection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListExampleTest {
    ListExample listExample = new ListExample();
    List<String> exampleList = new ArrayList<>();
    List<String> listToBeAddedToAnotherList = new ArrayList<>();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

        exampleList.add("One");
        exampleList.add("Two");
        exampleList.add("Three");
        exampleList.add("Four");
        exampleList.add("Five");
        exampleList.add("Six");
        exampleList.add("PleasePrintMe");
        exampleList.add("DoNotPrint");

        listToBeAddedToAnotherList.add("value1");
        listToBeAddedToAnotherList.add("value2");
    }

    @Test
    void testCreateAndReturnList() {
        assertEquals(exampleList, listExample.createAndReturnList());
    }

    @Test
    void testGetListElementsJoined() {
        listExample.getListElementsJoined(exampleList);
        assertEquals("Joined List Elements are: OneTwoThreeFourFiveSixPleasePrintMeDoNotPrint", outputStreamCaptor.toString());
    }

    @Test
    void testReverseList() {
        listExample.reverseList(exampleList);
        assertEquals("\nReversed List Elements: DoNotPrint PleasePrintMe Six Five Four Three Two One", outputStreamCaptor.toString());
    }

    @Test
    void testDisplayElementWithIndexTwo() {
        listExample.displayElementWithIndexTwo(exampleList);
        assertEquals("\nElement Two has index: 1", outputStreamCaptor.toString());
    }

    @Test
    void testAddAListToAnotherOne() {
        listExample.addAListToAnotherOne(exampleList);
        exampleList.addAll(listToBeAddedToAnotherList);
        assertEquals("\nNew List is: [One, Two, Three, Four, Five, Six, PleasePrintMe, DoNotPrint, value1, value2]", outputStreamCaptor.toString());
    }

    @Test
    void testPrintList() {
        listExample.printList(exampleList);
        assertEquals("List elements displayed using a separate method:  One Two Three Four Five Six", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}