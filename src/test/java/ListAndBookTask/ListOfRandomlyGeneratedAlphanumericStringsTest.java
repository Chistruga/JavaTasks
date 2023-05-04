package ListAndBookTask;

import JavaCollection.ListExample;
import Utils.RemoveElementFromTheListByASpecificParameter;
import Utils.SortAListInDescendingOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListOfRandomlyGeneratedAlphanumericStringsTest {
    List<String> listOfStrings = new ArrayList<>();
    private String stringOne;
    private String stringTwo;
    private String stringThree;
    private String stringFour;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    RemoveElementFromTheListByASpecificParameter removeElementFromTheListByASpecificParameter = new RemoveElementFromTheListByASpecificParameter();
    SortAListInDescendingOrder sortAListInDescendingOrder = new SortAListInDescendingOrder();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

        listOfStrings.add("les");
        listOfStrings.add("lesa");
        listOfStrings.add("ales");
        stringOne = "One";
        stringTwo = "Two";
        stringThree = "Three";
        stringFour = "Four";
        listOfStrings.add(stringOne);
        listOfStrings.add(stringTwo);
        listOfStrings.add(stringThree);
        listOfStrings.add(stringFour);
    }

    @Test
    void testSortListInDescendingOrder(){
        sortAListInDescendingOrder.sortInDescendingOrder(listOfStrings);
        assertEquals("\nDescending sorted list: [Two, Three, One, lesa, les, Four, ales]",outputStreamCaptor.toString());
    }

    @Test
    void testRemoveElementsFromList() {
        removeElementFromTheListByASpecificParameter.removeElementFromTheList(listOfStrings, "les");
        assertEquals("\nBefore removing: [les, lesa, ales, One, Two, Three, Four]\n" +
                "After removing: [One, Two, Three, Four]",outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}