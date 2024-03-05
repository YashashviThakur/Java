import java.util.*;
interface Sayable{  
    public String say(String name);  
}  

public class LambdaExpressionExample2 {
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
        Sayable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Yashashvi"));  
          
        // You can omit function parentheses    
        Sayable s2= name ->{  
            return "How are you "+name;  
        };  
        System.out.println(s2.say("Yashashvi"));  
    }  
}
