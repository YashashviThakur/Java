import java.util.*;

class Employee implements Comparable<Employee> {  
    public String name;  
  public Employee(String name) {  
    this.name = name;  
  }  

  public int compareTo(Employee person) {  
    return name.compareTo(person.name);  
  }   
}  

public class ComparableClassTest {
    public static void main(String[] args) {  
        ArrayList<Employee> list=new ArrayList<Employee>();  
        list.add(new Employee("Charles"));  
        list.add(new Employee("Aura"));  
        list.add(new Employee("Das"));  
        list.add(new Employee("Bruce"));  
        
      Collections.sort(list);  
      for (Employee s : list) {  
        System.out.println(s.name);  
      }  
    }  
}
