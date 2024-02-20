import java.util.*;

public class PriorityQueueTest {
    public static void main(String args[]) {
        PriorityQueue<String> list = new PriorityQueue<String>();
     list.add("First");
     list.add("Second");
     list.add("Third");
     list.add("Fourth");
        System.out.println("head : " + list.element());
        System.out.println("head : " + list.peek());
        System.out.println("Iterating the queue list elements:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
     list.remove();
     list.poll();
        System.out.println("After removing two lists : ");
        Iterator<String> itr2 = list.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
