public class LocalInnerClassTest {
    private int data = 30;

    void display() {
        class Local {
            void msg() {
                System.out.println("Value Derived From Local Inner Class - "+data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        LocalInnerClassTest obj = new LocalInnerClassTest();
        obj.display();
    }
}
