package OOPTask;

import Utils.FiguresWithSides;

public class Rectangle extends FiguresWithSides {
    private String name = "Rectangle";
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public void showFigureName() {
        System.out.print("\nFigure is a " + getName());
    }

    @Override
    public void calculateFigureArea() {
        int area = length * width;
        System.out.print("\nRectangle Area is " + area);
    }

    @Override
    public void calculateFigurePerimeter() {
        int perimeter = (2 * length) + (2 * width);
        System.out.print("\nRectangle Perimeter is " + perimeter);
    }

    @Override
    public void displaySideNumbers() {
        System.out.print("\nRectangle has " + getNUMBER_OF_SIDES() + " sides");
    }
}