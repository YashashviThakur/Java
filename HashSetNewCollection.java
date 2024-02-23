import java.util.*;

public class HashSetNewCollection {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        HashSet<String> set = new HashSet<String>(list); // Inserting HashSet list in ArrayList and then calling
        set.add("Fourth From Another List");

        LinkedHashSet<String> set2 = new LinkedHashSet<String>(set); // Inserting LinkedHashSet list in Hashset and then
                                                                     // calling it
        set2.add("Fifth From Another List");

        Iterator<String> itr = set2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
