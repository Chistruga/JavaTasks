package JavaCollection;

import java.util.*;

public class ListExample {
    public List<String> createAndReturnList() {
        List<String> exampleList = new ArrayList<>();
        exampleList.add("One");
        exampleList.add("Two");
        exampleList.add("Three");
        exampleList.add("Four");
        exampleList.add("Five");
        exampleList.add("Six");
        exampleList.add("PleasePrintMe");
        exampleList.add("DoNotPrint");

        return exampleList;
    }

    public void getListElementsJoined(List<String> list) {
        Iterator<String> iterator = list.iterator();

        System.out.print("Joined List Elements are: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }

    public void reverseList(List<String> listToBeReversed) {
        System.out.print("\nReversed List Elements:");
        Collections.reverse(listToBeReversed);
        for (String listElements : listToBeReversed) {
            System.out.print(" " + listElements);
        }
    }

    public void displayElementWithIndexTwo(List<String> listToBeCheckedForIndex) {
        System.out.print("\nElement Two has index: " + listToBeCheckedForIndex.indexOf("Two"));
    }

    public void addAListToAnotherOne(List<String> defaultList) {
        List<String> listToBeMerged = new ArrayList<>();
        listToBeMerged.add("value1");
        listToBeMerged.add("value2");

        defaultList.addAll(listToBeMerged);
        System.out.print("\nNew List is: " + defaultList);
    }

    public void printList(List<String> inputList) {
        System.out.print("List elements displayed using a separate method: ");
        for (String element : inputList) {
            if (!element.equals("PleasePrintMe") && !element.equals("DoNotPrint"))
                System.out.print(" " + element);
        }
    }
}