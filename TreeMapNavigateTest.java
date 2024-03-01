import java.util.*;

public class TreeMapNavigateTest {
    public static void main(String args[]){  

        NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
           map.put(1,"First");    
           map.put(2,"Second");    
           map.put(3,"Third");    
           map.put(4,"Fourth");    

           for(Map.Entry<Integer,String> m : map.entrySet())
           {
            // System.out.println(m);  //Will print all the pairs in equalising manner
            System.out.println(m.getKey()+ " " +m.getValue()); //Will print just the key and value pair side by side
           }

           //Maintains descending order  
           System.out.println("descendingMap : "+map.descendingMap());  

           //Returns key-value pairs whose keys are less than or equal to the specified key.  
           System.out.println("headMap : "+map.headMap(3));  

           //Returns key-value pairs whose keys are greater than or equal to the specified key. (giving true will include that key also)
           System.out.println("tailMap : "+map.tailMap(2,true));  

           //Returns key-value pairs exists in between the specified key.  (giving true will include that key also)
           System.out.println("subMap : "+map.subMap(1, false, 4, true));   
      }  
}
