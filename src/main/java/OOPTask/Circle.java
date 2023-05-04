package OOPTask;

import Utils.FiguresWithoutSides;

public class Circle implements FiguresWithoutSides {
    private String name = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void displayFigureName() {
        System.out.print("\nFigure is a " + getName());
    }

    @Override
    public void calculateFigureArea() {
        double area = PI * radius * radius;
        System.out.print("\nCircle Area is " + area);
    }

    @Override
    public void calculateFigurePerimeter() {
        double perimeter = 2 * PI * radius;
        System.out.print("\nCircle Perimeter is " + perimeter);
    }
}