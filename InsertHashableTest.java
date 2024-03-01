
import java.util.*;

public class InsertHashableTest {
    public static void main(String args[]){  
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();  
        
        map.put(1,"First");    
        map.put(4,"Fourth");
        map.put(3,"Third");   
        map.put(2,"Second");  
        

        System.out.println("Initial Map : "+map);  

         //Inserts, as the specified pair is unique  
        map.putIfAbsent(5,"Fifth");  
        System.out.println("Updated Map: "+map);  

        //Returns the current value, as the specified pair already exist  
        map.putIfAbsent(4,"Fourth");  
        System.out.println("Updated Map: "+map);  
    }   
}
