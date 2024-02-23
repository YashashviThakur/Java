import java.util.*;

public class TreeSetTest2 {
    public static void main(String args[]){     
 TreeSet<Integer> list=new TreeSet<Integer>();    
         list.add(24);    
         list.add(66);    
         list.add(12);    
         list.add(15);    
         System.out.println(list);
         System.out.println("Lowest Value : "+list.pollFirst());    
         System.out.println("Highest Value : "+list.pollLast());    
 }    
}
