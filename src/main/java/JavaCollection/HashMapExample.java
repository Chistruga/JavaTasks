package JavaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    private Object valueForSecondKey = "NotSecond";
    private Object valueForThirdKey = null;

    public HashMap<String, Object> createAndReturnHashMap() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("First", 1);
        hashMap.put("Second", "Two");
        hashMap.put("Third", 3.3);
        hashMap.put("Fourth", false);

        return hashMap;
    }

    public void displayHashMapKeys() {
        ArrayList<String> keyList = new ArrayList<>(createAndReturnHashMap().keySet());
        System.out.print("\n\nHash Map Keys are: " + keyList);
    }

    public void displayHashMapValues() {
        ArrayList<Object> valueList = new ArrayList<>(createAndReturnHashMap().values());
        System.out.print("\nHash Map Values are: " + valueList);
    }

    public void setValueForSecondKey(HashMap<String, Object> hashMap) {
        hashMap.put("Second", valueForSecondKey);
        System.out.print("\nNew Map Values are: ");
        for (Map.Entry<String, Object> element : hashMap.entrySet()) {
            System.out.print("\nKey - " + element.getKey() + "; Value - " + element.getValue());
        }
    }

    public void removeValueOfThirdKey(HashMap<String, Object> hashMap) {
        hashMap.put("Third", valueForThirdKey);
        System.out.print("\nNew Map Values are: ");
        for (Map.Entry<String, Object> element : hashMap.entrySet()) {
            System.out.print("\nKey - " + element.getKey() + "; Value - " + element.getValue());
        }
    }

    public void printMapValues(Map<?, ?> inputMap) {
        System.out.print("\nHashMap elements iterated using a separate method: ");
        inputMap.entrySet().stream().forEach(input -> System.out.print("\nKey - " + input.getKey() + ", Value - " + input.getValue()));
    }
}