import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello..!!");
        list.add("Welcome To");
        list.add("Java Programming");
        list.add("By Yashashvi Thakur");
        
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }    
}
