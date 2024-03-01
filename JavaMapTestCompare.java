import java.util.*;

public class JavaMapTestCompare {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");

        // Returns a Set view of the mappings contained in this map
        map.entrySet()
                // Returns a sequential Stream with this collection as its source
                .stream()
                // Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                // Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}
