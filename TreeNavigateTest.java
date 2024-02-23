import java.util.*;

public class TreeNavigateTest {
    public static void main (String args[]){
        TreeSet<String> list = new TreeSet<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        System.out.println("Initial List : "+list);
        System.out.println("Reverse Tree Set : "+list.descendingSet());
        System.out.println("Head Set : "+list.headSet("Fourth,true"));
        System.out.println("SubSet : "+list.subSet("First",false,"Fourth",true));
        System.out.println("TailSet : "+list.tailSet("Third",true));
    }
}
