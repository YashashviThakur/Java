import java.util.Map;
import java.util.*;

public class SortedTreeMap {
    public static void main(String args[]){  

        SortedMap<Integer,String> map=new TreeMap<Integer,String>(); //created sorted tree map which sorts the list automatically
           map.put(1,"First");    
           map.put(4,"Fourth");
           map.put(3,"Third");   
           map.put(2,"Second");    
           

           for(Map.Entry<Integer,String> m : map.entrySet())
           {
            // System.out.println(m);  //Will print all the pairs in equalising manner
            System.out.println(m.getKey()+ " " +m.getValue()); //Will print just the key and value pair side by side
           }

           //Returns key-value pairs whose keys are less than the specified key.  
           System.out.println("headMap : "+map.headMap(3));  

           //Returns key-value pairs whose keys are greater than or equal to the specified key.
           System.out.println("tailMap : "+map.tailMap(2));  

           //Returns key-value pairs exists in between the specified key. 
           System.out.println("subMap : "+map.subMap(1, 4 ));   
      }  
}
