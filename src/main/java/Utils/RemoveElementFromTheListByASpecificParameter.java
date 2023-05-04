package Utils;

import java.util.List;

public class RemoveElementFromTheListByASpecificParameter <T extends Comparable<T>>{
    public void removeElementFromTheList(List<T> initialList, String comparableValue) {
        try {
            List<T> anotherList = initialList;
            System.out.print("\nBefore removing: " + initialList);
            anotherList.removeIf(n -> {
                if (n instanceof String) {
                    return ((String) n).contains(comparableValue);
                } else {
                    return n.toString().contains(comparableValue);
                }
            });
            System.out.print("\nAfter removing: " + anotherList);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}