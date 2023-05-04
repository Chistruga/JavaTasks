package OOPTask;

import Utils.QueryHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FiguresTest {
    Circle circle = new Circle(5);
    Square square = new Square(6);
    Rectangle rectangle = new Rectangle(4, 5);
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testDisplayFigureNameOfCircle() {
        circle.displayFigureName();
        assertEquals("\nFigure is a Circle", outputStreamCaptor.toString());
    }

    @Test
    void testCalculateFigureAreaOfCircle() {
        circle.calculateFigureArea();
        assertEquals("\nCircle Area is 78.5", outputStreamCaptor.toString());
    }

    @Test
    void testcalculateFigurePerimeterOfCircle() {
        circle.calculateFigurePerimeter();
        assertEquals("\nCircle Perimeter is 31.400000000000002", outputStreamCaptor.toString());
    }

    @Test
    void testShowFigureNameOfSquare() {
        square.showFigureName();
        assertEquals("\nFigure is a Square", outputStreamCaptor.toString());
    }

    @Test
    void testDisplaySideNumbersOfSquare() {
        square.displaySideNumbers();
        assertEquals("\nSquare has 4 sides", outputStreamCaptor.toString());
    }

    @Test
    void testCalculateFigureAreaOfSquare() {
        square.calculateFigureArea();
        assertEquals("\nSquare Area is 36", outputStreamCaptor.toString());
    }

    @Test
    void testCalculateFigurePerimeterOfSquare() {
        square.calculateFigurePerimeter();
        assertEquals("\nSquare Perimeter is 12", outputStreamCaptor.toString());
    }

    @Test
    void testShowFigureNameOfRectangle() {
        rectangle.showFigureName();
        assertEquals("\nFigure is a Rectangle", outputStreamCaptor.toString());
    }

    @Test
    void testDisplaySideNumbersOfRectangle() {
        rectangle.displaySideNumbers();
        assertEquals("\nRectangle has 4 sides", outputStreamCaptor.toString());
    }

    @Test
    void testCalculateFigureAreaOfRectangle() {
        rectangle.calculateFigureArea();
        assertEquals("\nRectangle Area is 20", outputStreamCaptor.toString());
    }

    @Test
    void testCalculateFigurePerimeterOfRectangle() {
        rectangle.calculateFigurePerimeter();
        assertEquals("\nRectangle Perimeter is 18", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}