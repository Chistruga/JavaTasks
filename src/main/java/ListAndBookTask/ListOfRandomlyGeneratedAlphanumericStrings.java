package ListAndBookTask;

import Utils.GenerateRandomAlphanumericString;
import Utils.RemoveElementFromTheListByASpecificParameter;
import Utils.SortAListInDescendingOrder;

import java.util.ArrayList;
import java.util.List;

public class ListOfRandomlyGeneratedAlphanumericStrings {
    SortAListInDescendingOrder sortAnArray = new SortAListInDescendingOrder();
    RemoveElementFromTheListByASpecificParameter removeElementFromTheList = new RemoveElementFromTheListByASpecificParameter();

    public void performActionsOnGeneratedString() {
        String listString = "";

        GenerateRandomAlphanumericString randomAlphanumericString = new GenerateRandomAlphanumericString();
        List list = new ArrayList<>();
        list.add("lesa");
        list.add("alesa");
        list.add("aaales");

        for (int i = 0; i < 20; i++) {
            listString = randomAlphanumericString.generateRandomAlphanumericString(10);
            list.add(listString);
        }
        sortAnArray.sortInDescendingOrder(list);
        removeElementFromTheList.removeElementFromTheList(list, "les");
    }
}