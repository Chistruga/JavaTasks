package ListAndBookTask;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BookTasksTest {
    BookTasks bookTasks = new BookTasks();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testGetfirstSpanishBook(){
        bookTasks.getfirstSpanishBook();
        assertEquals("\nFirst Spanish Book from the list: \n" +
                "{numberOfPages=306, author=Dale Carnegie, publisher=Curtea Veche Publishing, language=SPANISH, title=How to Stop Worrying and Start Living, bookType=Self-help book}", outputStreamCaptor.toString());
    }

    @Test
    void testSortListOfBooksByAuthor(){
        bookTasks.sortListOfBooksByAuthor();
        assertEquals("\nList of books sorted in ascending order: \n" +
                "[{numberOfPages=500, author=Carlos Ruiz Zafón, publisher=Curtea Veche Publishing, language=ENGLISH, title=The Shadow of the Wind, bookType=Novel}, {numberOfPages=306, author=Dale Carnegie, publisher=Curtea Veche Publishing, language=SPANISH, title=How to Stop Worrying and Start Living, bookType=Self-help book}, {numberOfPages=520, author=Eckhart Tolle, publisher=Curtea Veche Publishing, language=SPANISH, title=The Power of Now: A Guide to Spiritual Enlightenment, bookType=Self-help book}, {numberOfPages=320, author=Ioan Slavici, publisher=Lumina, language=ROMANIAN, title=The lucky mill, bookType=Novella}, {numberOfPages=120, author=Isabel Allende, publisher=Curtea Veche Publishing, language=ENGLISH, title=La casa de los espíritus, bookType=Novel}, {numberOfPages=250, author=Pablo Neruda, publisher=Curtea Veche Publishing, language=ROMANIAN, title=Twenty Love Poems and a Song of Despair, bookType=Romantic poems}, {numberOfPages=400, author=Paulo Coelho, publisher=Curtea Veche Publishing, language=SPANISH, title=The Alchemist, bookType=Novel}, {numberOfPages=400, author=Robert Greene, publisher=Curtea Veche Publishing, language=ENGLISH, title=The 48 Laws of Power, bookType=Self-help book}]", outputStreamCaptor.toString());
    }

    @Test
    void testGetTheBookWithMaximumPagesByTitle(){
        bookTasks.getTheBookWithMaximumPagesByTitle();
        assertEquals("\nBook with the maximum page value is: The Power of Now: A Guide to Spiritual Enlightenment", outputStreamCaptor.toString());
    }

    @Test
    void testGetAListOfBooksThatHaveMoreThan200Pages(){
        bookTasks.getAListOfBooksThatHaveMoreThan200Pages();
        assertEquals("\nList of books which have more than 200 pages: \n" +
                "[{numberOfPages=320, author=Ioan Slavici, publisher=Lumina, language=ROMANIAN, title=The lucky mill, bookType=Novella}, {numberOfPages=306, author=Dale Carnegie, publisher=Curtea Veche Publishing, language=SPANISH, title=How to Stop Worrying and Start Living, bookType=Self-help book}, {numberOfPages=400, author=Paulo Coelho, publisher=Curtea Veche Publishing, language=SPANISH, title=The Alchemist, bookType=Novel}, {numberOfPages=500, author=Carlos Ruiz Zafón, publisher=Curtea Veche Publishing, language=ENGLISH, title=The Shadow of the Wind, bookType=Novel}, {numberOfPages=250, author=Pablo Neruda, publisher=Curtea Veche Publishing, language=ROMANIAN, title=Twenty Love Poems and a Song of Despair, bookType=Romantic poems}, {numberOfPages=520, author=Eckhart Tolle, publisher=Curtea Veche Publishing, language=SPANISH, title=The Power of Now: A Guide to Spiritual Enlightenment, bookType=Self-help book}, {numberOfPages=400, author=Robert Greene, publisher=Curtea Veche Publishing, language=ENGLISH, title=The 48 Laws of Power, bookType=Self-help book}]", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}