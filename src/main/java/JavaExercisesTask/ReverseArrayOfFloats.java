package JavaExercisesTask;

import Utils.ReadAnArrayFromConsole;

public class ReverseArrayOfFloats {

    public void reverseAnArray() {

        ReadAnArrayFromConsole readAnArrayFromConsole = new ReadAnArrayFromConsole();
        double[] initialArray = readAnArrayFromConsole.readAndPrintDoubleArrayFromConsole();

        System.out.println("\nReversed array is: ");
        for (int i = readAnArrayFromConsole.getNumberOfElementsInArray() - 1; i >= 0; i--) {
            System.out.print("[" + initialArray[i] + "]" + "\t");
        }
    }
}