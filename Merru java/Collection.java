
import java.util.ArrayList;
import java.util.HashSet;

public class Collection {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("Is Apple in ArrayList? " + arrayList.contains("Apple"));

        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        System.out.println("\nHashSet: " + hashSet);
        System.out.println("HashSet size: " + hashSet.size());
        System.out.println("Is Apple in HashSet? " + hashSet.contains("Apple"));
    }
}
