package Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadDynamicSizeArray {
    private int numberOfLinesInArray;

    private int numberOfElementsPerLine;

    private int element;

    public ArrayList<ArrayList<Integer>> readDynamicArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> generalList = new ArrayList<>();
        System.out.print("Give the number of lines in array: ");
        numberOfLinesInArray = scanner.nextInt();
        for (int i = 0; i < numberOfLinesInArray; i++) {
            System.out.print("Give the number of elements for the line: ");
            numberOfElementsPerLine = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Give the line elements: ");
            for (int j = 0; j < numberOfElementsPerLine; j++) {
                element = scanner.nextInt();
                list.add(element);
            }
            generalList.add(list);
        }
        return generalList;
    }
}