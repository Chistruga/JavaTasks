package OOPTask;

import Utils.FiguresWithSides;

public class Square extends FiguresWithSides {
    private String name = "Square";
    private int sideLength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void showFigureName() {
        System.out.print("\nFigure is a " + getName());
    }

    @Override
    public void calculateFigureArea() {
        int area = sideLength * sideLength;
        System.out.print("\nSquare Area is " + area);
    }

    @Override
    public void calculateFigurePerimeter() {
        int perimeter = 2 * sideLength;
        System.out.print("\nSquare Perimeter is " + perimeter);
    }

    @Override
    public void displaySideNumbers() {
        System.out.print("\nSquare has " + getNUMBER_OF_SIDES() + " sides");
    }
}