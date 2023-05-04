package JavaCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    private long multipliedEvenSetElements = 1;

    public HashSet<Integer> createAndReturnHashSet(){
        HashSet<Integer> exampleSet = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            exampleSet.add(i);
        }
        return exampleSet;
    }

    public void determineHashSetSize(HashSet<Integer> hashSet){
        System.out.print("\n\nHashSet size is: " + hashSet.size());
    }

    public void iterateHashSetElements(HashSet<Integer> hashSet){
        System.out.print("\nHashSet elements are:");
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
    }

    public void determineTotalMultipliedElements(HashSet<Integer> hashSet){
        for (Integer element : hashSet) {
            if (element % 2 == 0 && element != 0) {
                multipliedEvenSetElements *= element;
            }
        }
        System.out.print("\nTotal Multiplied Even elements is: " + multipliedEvenSetElements);
    }
}