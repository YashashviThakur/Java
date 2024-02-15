public class StaticNestedClassTest {
    static int data = 30;

    static class Inner {
        void msg() {
            System.out.println("Value Derived From Static Nested Inner Class - " + data);
        }
    }

    public static void main(String args[]) {
        StaticNestedClassTest.Inner obj = new StaticNestedClassTest.Inner();
        obj.msg();
    }
}
