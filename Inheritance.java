class Employee_name {
    void name(){
        System.out.println("Name - Yashashvi Thakur");
    }
}

class Employee_id extends Employee_name{
    void id(){
        System.out.println("Id - RW199");
    }
}

class Employee_username extends Employee_id{
    void username(){
        System.out.println("Your User Name (Login ID) - 121212");
    }
}

class Employee_pass extends Employee_username{
    void pass(){
        System.out.println("Your Login Password - 123456");
    }
}

public class Inheritance {
    public static void main (String args[]) {
        System.out.println("Welcome To RailWorld India Pvt Ltd.");
        Employee_pass i = new Employee_pass();
        i.name();
        i.id();
        i.username();
        i.pass();
    }
}