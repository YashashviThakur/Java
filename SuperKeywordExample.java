
class Company {
    String name = "Google";
}

class Employee extends Company {
    String name = "Ram";

    void printname() {
        System.out.println(name);
        System.out.println(super.name); //Prints the company name not employees
    }
}

class SuperKeywordExample {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.printname();
    }
}
