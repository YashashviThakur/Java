import java.util.*;

class Product2{  
    int id;  
    String name;  
    float price;  
    public Product2(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class ComparatorUsingLambdaTest {
    public static void main(String[] args) {  
        List<Product2> list=new ArrayList<Product2>();  
          
        //Adding Products  
        list.add(new Product2(1,"HP Laptop",25000f));  
        list.add(new Product2(3,"Keyboard",300f));  
        list.add(new Product2(2,"Dell Mouse",150f));  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        });  
        for(Product2 p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
  
    }  
}
