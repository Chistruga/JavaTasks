package Utils;

import java.util.Collections;
import java.util.List;

public class SortAListInDescendingOrder {
    public void sortInDescendingOrder(List<String> listToSortInDescendingOrder) {
        try {
            List sortedListInDescendingOrder = listToSortInDescendingOrder;
            Collections.sort(sortedListInDescendingOrder, String.CASE_INSENSITIVE_ORDER);
            Collections.reverse(sortedListInDescendingOrder);
            System.out.println("Descending sorted list: " + sortedListInDescendingOrder);

        } catch (NullPointerException e) {
            e.getMessage();
        }
    }
}