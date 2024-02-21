import java.util.*;

public class LinkedHashSetTest {
    public static void main (String args[]){
        LinkedHashSet<String> list = new LinkedHashSet<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Second"); //Takes only unique elements not duplicates but is arranged as ordered input..!
        list.add(null); //It also permits null value

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


