import java.util.*;

public class ReverseLinkedList {
    public static void main (String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        Iterator<String> itr = list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
