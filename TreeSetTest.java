import java.util.*;

public class TreeSetTest {
    public static void main (String args[]){
        TreeSet<String> list = new TreeSet<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Second"); //Takes only unique elements not duplicates and arrange it in ascending order..!

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
