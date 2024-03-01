import java.util.EnumMap;
import java.util.Map;

public class JavaEnumMapsTest {
     public enum WeekDays {  
   Monday, Tuesday, Wednesday, Thursday  
   };  
   public static void main(String[] args) {  
   //create and populate enum map  
   EnumMap<WeekDays, String> map = new EnumMap<WeekDays, String>(WeekDays.class);  
   map.put(WeekDays.Monday, "1");  
   map.put(WeekDays.Tuesday, "2");  
   map.put(WeekDays.Wednesday, "3");  
   map.put(WeekDays.Thursday, "4");  
   
   // print the map  
   for(Map.Entry<WeekDays,String> m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }   
   }  
}
