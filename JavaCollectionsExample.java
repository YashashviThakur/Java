import java.util.*;

public class JavaCollectionsExample {
    public static void main(String a[]){      
        List<String> list = new ArrayList<String>();  
        list.add("C");  
        list.add("Core Java");  
        list.add("Advance Java");  
        System.out.println("Initial collection value : "+list);  

        Collections.addAll(list, "Servlet","JSP");   //adding contents to list
        System.out.println("After adding elements collection value : "+list);  


        String[] strArr = {"C#", ".Net"};   //creating array
        Collections.addAll(list, strArr);   //adding array to list
        System.out.println("After adding array collection value : "+list);  
    }  
}
