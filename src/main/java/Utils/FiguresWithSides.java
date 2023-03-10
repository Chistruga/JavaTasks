package Utils;

public abstract class FiguresWithSides {
    final int NUMBER_OF_SIDES = 4;

    public int getNUMBER_OF_SIDES() {
        return NUMBER_OF_SIDES;
    }

    public abstract void showFigureName();

    public abstract void calculateFigureArea();

    public abstract void calculateFigurePerimeter();

    public abstract void displaySideNumbers();
}