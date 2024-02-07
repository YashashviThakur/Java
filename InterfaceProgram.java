interface Laptop {
    public void processor();
    public void price();
}

class Lenovo implements Laptop {
    public void processor() {
        System.out.println("Lenovo has Intel i7 Processor");
    }

    public void price() {
        System.out.println("Price for Lenovo Laptop is - Rs.75000");
    }
}

class Asus implements Laptop {
    public void processor() {
        System.out.println("Asus has Intel i6 Processor");
    }

    public void price() {
        System.out.println("Price for Asus Laptop is - Rs.55000");
    }
}

class HP implements Laptop {
    public void processor() {
        System.out.println("HP has Intel i3 Processor");
    }

    public void price() {
        System.out.println("Price for HP Laptop is - Rs.30000");
    }
}


public class InterfaceProgram {
    public static void main(String args[]) {

        Lenovo l1 = new Lenovo();
        l1.processor();
        l1.price();

        Asus a1 = new Asus();
        a1.processor();;
        a1.price();

        HP h1 = new HP();
        h1.processor();
        h1.price();

    }
 
}
