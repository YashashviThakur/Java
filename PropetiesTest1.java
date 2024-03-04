import java.util.*;
import java.io.*;

public class PropetiesTest1 {
    public static void main(String[] args)throws Exception{  
        FileReader reader=new FileReader("file.txt");  
          
        Properties p=new Properties();  
        p.load(reader);  
          
        System.out.println(p.getProperty("user"));  
        System.out.println(p.getProperty("password"));  
    }  
}
