
public class MemberInnerClassTest {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("Value is (Taking From Outer Class) - " + data);
        }
    }

    public static void main(String args[]) {
        MemberInnerClassTest obj = new MemberInnerClassTest();
        MemberInnerClassTest.Inner in = obj.new Inner();
        in.msg();
    }
}
