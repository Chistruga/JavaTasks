package JavaTaskSynamicSizeArray;

import Utils.QueryHelper;
import Utils.ReadDynamicSizeArray;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicSizeArrayQueries {

    private int numberOfQueries;
    private int axisX;
    private int axisY;

    public void getElementsOfDynamicArrayUsingQueries() {
        ReadDynamicSizeArray readDynamicSizeArray = new ReadDynamicSizeArray();
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayList = readDynamicSizeArray.readDynamicArray();
        ArrayList<QueryHelper<Integer, Integer>> pairList = new ArrayList<QueryHelper<Integer, Integer>>();

        System.out.println("Enter the combinations on X & Y Axis to find the element: ");
        numberOfQueries = scanner.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            System.out.print("X: ");
            axisX = scanner.nextInt() - 1;
            System.out.print("Y: ");
            axisY = scanner.nextInt() - 1;
            pairList.add(new QueryHelper<>(axisX, axisY));
        }

        for (QueryHelper<Integer, Integer> ob : pairList) {
            try {
                System.out.println(arrayList.get(ob.getKey()).get(ob.getValue()));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}