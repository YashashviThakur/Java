import java.util.*;

class Student implements Comparable<Student>{  
    int rollno;  
    String name;  
    int age;  
    Student(int rollno,String name,int age){  
    this.rollno=rollno;  
    this.name=name;  
    this.age=age;  
    }  

    //Sorted By Age
      
    public int compareTo(Student st){  
    if(age==st.age)  
    return 0;  
    else if(age>st.age)  
    return 1;  
    else  
    return -1;  
    }  
    }  

public class ComparableInterfaceTest {
    public static void main(String args[]){  
        ArrayList<Student> al=new ArrayList<Student>();  
        al.add(new Student(2,"Robert",23));  
        al.add(new Student(6,"Downey",27));  
        al.add(new Student(9,"Jr.",21));  
          
        Collections.sort(al);  
        for(Student st:al){  
        System.out.println(st.rollno+" "+st.name+" "+st.age);  
        }  
        }  
}
