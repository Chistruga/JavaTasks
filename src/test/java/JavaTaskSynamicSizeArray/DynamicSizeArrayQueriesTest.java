package JavaTaskSynamicSizeArray;

import Utils.QueryHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DynamicSizeArrayQueriesTest {
    DynamicSizeArrayQueries dynamicSizeArrayQueries = new DynamicSizeArrayQueries();
    ArrayList<QueryHelper<Integer, Integer>> pairList = new ArrayList<QueryHelper<Integer, Integer>>();
    public ArrayList<ArrayList<Integer>> generalList = new ArrayList<>();
    public ArrayList<Integer> list = new ArrayList<>();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        list.add(1);
        list.add(2);
        list.add(3);
        generalList.add(list);
    }

    @Test
    void testDynamicSizeArrayForAValidQuery() {
        pairList.add(new QueryHelper<>(0, 0));
        dynamicSizeArrayQueries.displayElementFromArrayBasedOnGivenQuery(generalList, pairList);

        assertEquals("1\r\n", outputStreamCaptor.toString());
    }

    @Test
    void testDynamicSizeArrayForNonValidQuery() {
        pairList.add(new QueryHelper<>(1, 0));
        dynamicSizeArrayQueries.displayElementFromArrayBasedOnGivenQuery(generalList, pairList);

        assertEquals("ERROR!\r\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}