package JavaTaskSynamicSizeArray;

import Utils.QueryHelper;
import Utils.ReadDynamicSizeArray;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicSizeArrayQueries {
    public void displayElementFromArrayBasedOnGivenQuery(ArrayList<ArrayList<Integer>> givenArray, ArrayList<QueryHelper<Integer, Integer>> pairList){
        for (QueryHelper<Integer, Integer> ob : pairList) {
            try {
                System.out.println(givenArray.get(ob.getKey()).get(ob.getValue()));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}