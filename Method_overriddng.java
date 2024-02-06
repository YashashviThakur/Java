public class Method_overriddng {
    public int sum(int a, int b) {
        return (a + b);
    }

    public int multiply(int a, int b) {
        return (a*b);
    }

    public static void main (String args[]){
        Method_overriddng m = new Method_overriddng();
        System.out.println("Sum of two values is = "+m.sum(2,3));
        System.out.println("Multiplication of two values is = "+m.multiply(2,3));
    }
}
