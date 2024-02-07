class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}

public class Aggregation {
    int id;
    String name;
    Address address;

    public Aggregation(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("Employee Id - " + id + "\nEmployee Name - " + name);
        System.out.println("Employee Address City - " + address.city + ", State - " + address.state + ", Country - "
                + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Ayodhya", "UP", "India\n");
        Address address2 = new Address("Ayodhya", "UP", "India");

        Aggregation e = new Aggregation(111, "Ram", address1);
        Aggregation e2 = new Aggregation(112, "Laxman", address2);

        e.display();
        e2.display();

    }
}
