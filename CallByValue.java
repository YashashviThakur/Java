
public class CallByValue {
    int data = 50;

    void change(CallByValue op) {
        op.data = op.data + 100;
    }

    public static void main(String args[]) {
        CallByValue op = new CallByValue();

        System.out.println("Before change - " + op.data);
        System.out.println("After change - " + op.data);
        System.out.println("\nOn Changing the instance variable itself, then: ");
        System.out.println("Before change - " + op.data);
        op.change(op);
        System.out.println("After change - " + op.data);

    }
}
