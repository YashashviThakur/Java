public class Methods {
    public static void Method1() {
        System.out.println("Static Method Executed..!");
    }

    public void Method2() {
        System.out.println("Method Without Using Static Keyword Executed..!");
    }

    public static void Method3(String lastname) {
        System.out.println(lastname+ "Thakur - Executed through Parameters in Method");
    }

    public static void main (String args[]){
        Method1();
        Methods m2 = new Methods();
        m2.Method2();
        Method3("Yashashvi ");
    }
}
