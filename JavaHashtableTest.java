import java.util.*;

public class JavaHashtableTest{
    public static void main(String args[]){  
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();  
        
        map.put(1,"First");    
        map.put(4,"Fourth");
        map.put(3,"Third");   
        map.put(2,"Second");  
        
        //Prints greater key first

        for(Map.Entry<Integer,String> m:map.entrySet()){  
         System.out.println(m.getKey()+" "+m.getValue());  
        }  

        map.remove(2);  
        System.out.println("After remove: "+ map);  
       }  
}
