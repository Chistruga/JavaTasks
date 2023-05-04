package JavaTaskSynamicSizeArray;

import Utils.QueryHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QueriesForDynamicArray {
    private int numberOfQueries;
    private int axisX;
    private int axisY;
    public ArrayList<QueryHelper<Integer, Integer>> readQueriesFromConsole(){
        ArrayList<QueryHelper<Integer, Integer>> pairList = new ArrayList<QueryHelper<Integer, Integer>>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the combinations on X & Y Axis to find the element: ");
        numberOfQueries = scanner.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            System.out.print("X: ");
            axisX = scanner.nextInt() - 1;
            System.out.print("Y: ");
            axisY = scanner.nextInt() - 1;
            pairList.add(new QueryHelper<>(axisX, axisY));
        }
        return pairList;
    }

}
