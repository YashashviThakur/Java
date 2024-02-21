import java.util.*;

public class ArrayListForEachLoop {
        public static void main (String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Second"); 

        for (String rank:list){
            System.out.println(rank);
        }
    }
}
