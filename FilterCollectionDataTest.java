import java.util.*;
import java.util.stream.Stream;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  


public class FilterCollectionDataTest {
      public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung M10",17000f));  
        list.add(new Product(3,"Iphone 15",65000f));  
        list.add(new Product(2,"Oneplus 12",25000f));  
        list.add(new Product(4,"Nothing Phone 2",15000f));  
        list.add(new Product(5,"Redmi Poco 3",26000f));  
        list.add(new Product(6,"Oppo 13 plus",19000f));  
          
        // using lambda to filter data  
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
    }  
}
