abstract class Car{
    abstract void mileage();
}

class BMW extends Car{
    void mileage(){
        System.out.println("BMW has a mileage of 22kmpl");
    }
}

class Audi extends Car{
    void mileage(){
        System.out.println("Audi has a mileage of 20kmpl");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Car c = new BMW();
        c.mileage();
        Car d = new Audi();
        d.mileage();
    }
}
