import java.util.*;

public class ArrayListToArray {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        // Converting arrayList to array
        String[] array = list.toArray(new String[list.size()]);
        System.out.println("Printing Array: " + Arrays.toString(array));
        System.out.println("Printing List: " + list);
    }
}
