package DBTask;

import JavaCollection.HashSetExample;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.io.IOUtils;

class ReadFileContentTest {

    ReadFileContent readFileContent = new ReadFileContent();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testCountWordInFile() throws IOException {
        assertEquals(1,readFileContent.countWordInFile("Word12"));
    }

    @Test
    void testWriteToFile() throws IOException {
        String resultsFile = IOUtils.toString(new FileReader("results.txt"));
        readFileContent.writeToFile("Word1", new File("input.txt"));

        assertEquals("The given word Word1 is present for 4 times in the file", resultsFile);
    }

    @Test
    void testExtractResultsInAMap() throws IOException {
        readFileContent.extractResultsInAMap();
        assertEquals("\nWord Word3  was found 1 times on lines: [7]\n" +
                "Word Word2 was found 3 times on lines: [2, 4, 9]\n" +
                "Word Word1 was found 4 times on lines: [1, 3, 6, 8]\n" +
                "Word Word12 was found 1 times on lines: [5]", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}