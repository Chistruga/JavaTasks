package JavaCollection;

import java.util.*;

public class ListExample {
    public void createList() {
        List<String> exampleList = new ArrayList<>();
        exampleList.add("One");
        exampleList.add("Two");
        exampleList.add("Three");
        exampleList.add("Four");
        exampleList.add("Five");
        exampleList.add("Six");
        exampleList.add("PleasePrintMe");
        exampleList.add("DoNotPrint");

        Iterator<String> iterator = exampleList.iterator();

        System.out.print("Joined List Elements are: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

        System.out.print("\nReversed List Elements:");
        Collections.reverse(exampleList);
        for (String listElements : exampleList) {
            System.out.print(" " + listElements);
        }

        Collections.reverse(exampleList);
        System.out.println("\nElement Two has index: " + exampleList.indexOf("Two"));

        List<String> anotherExampleList = new ArrayList<>();
        anotherExampleList.add("value1");
        anotherExampleList.add("value2");

        exampleList.addAll(anotherExampleList);
        System.out.println("New List is: " + exampleList);

        printList(exampleList);
    }

    public void printList(List<String> inputList) {
        System.out.print("List elements displayed using a separate method: ");
        for (String element : inputList) {
            if (!element.equals("PleasePrintMe") && !element.equals("DoNotPrint"))
                System.out.print(" " + element);
        }
    }
}