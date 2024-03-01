import java.util.*;

public class CollectionsNumbersTest {
    public static void main(String a[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(16);
        list.add(28);
        list.add(31);
        list.add(22);
        list.add(52);
        list.add(6);
        System.out.println("Value of maximum element from the collection: " + Collections.max(list));
        System.out.println("Value of maximum element from the collection: " + Collections.min(list));

        System.out.println("The Sorted List is : ");
        Collections.sort(list);
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nThe Reversed Sorted List is : ");
        Collections.sort(list,Collections.reverseOrder());
        Iterator<Integer> itr2 = list.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
