import java.util.*;
import java.io.*;

public class PropertiesTest2 {
    public static void main(String[] args)throws Exception{  
  
        Properties p=new Properties();  
        
        //Adding properties into the new file
        p.setProperty("name","Yashashvi Thakur");  
        p.setProperty("email","tyash18@gmail.com");  
          

        //Giving filename and comment in the file
        p.store(new FileWriter("file2.txt"),"Name and E-mail in File");  
          
        }  
}
