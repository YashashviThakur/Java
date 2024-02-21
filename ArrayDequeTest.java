import java.util.*;

public class ArrayDequeTest {
    public static void main (String args[]){
        ArrayDeque<String> list = new ArrayDeque<String>();
        list.offer("First");
        list.offer("Second");
        list.offer("Third");
        list.offer("Fourth");
        list.offerFirst("AlwaysFirst");
        list.offerLast("AlwaysLast");
        
        System.out.println("All elements in the lists:");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        list.pollFirst();
        list.pollLast();
        System.out.println("\nOn removal from list from both sides : ");
        Iterator<String> itr2 = list.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        list.removeFirstOccurrence("Second");
        System.out.println("\nOn removing second from list : ");
        Iterator<String> itr3 = list.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
    }
}
