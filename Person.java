

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPersonName() {
        return name;
    }

    public int getPersonAge() {
        return age;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Ram", 28);
        Person person2 = new Person("Laxman", 26);

        System.out.println("First Persons Name - " + person1.getPersonName());
        System.out.println("First Persons Age - " + person1.getPersonAge());
        System.out.println("Second Persons Name - " + person2.getPersonName());
        System.out.println("Second Persons Age - " + person2.getPersonAge());
        
    }
}
