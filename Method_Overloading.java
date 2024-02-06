public class Method_Overloading {
    public int sum(int a, int b) {
        return (a + b);
    }

    public int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main (String args[]){
        Method_Overloading m = new Method_Overloading();
        System.out.println("Sum of two values is = "+m.sum(2,3));
        System.out.println("Sum of three values is = "+m.sum(2,3,4));
    }
}
