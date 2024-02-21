import java.util.*;

public class HashSetTest {
    public static void main (String args[]){
        HashSet<String> list = new HashSet<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Second"); //Takes only unique elements not duplicates but not arranged orderly

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

