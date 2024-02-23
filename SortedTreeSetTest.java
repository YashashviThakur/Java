import java.util.*;

public class SortedTreeSetTest {
    public static void main(String args[]) {
        TreeSet<String> list = new TreeSet<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");

        System.out.println("Intial Set : " + list);
        System.out.println("Head Set : " + list.headSet("Third"));
        System.out.println("SubSet : " + list.subSet("First", "Second"));
        System.out.println("TailSet : " + list.tailSet("Third"));
    }
}
