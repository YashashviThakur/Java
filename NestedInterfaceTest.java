
interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

class NestedInterfaceTest implements Showable.Message {
    public void msg() {
        System.out.println("Derived From Nested Interface");
    }

    public static void main(String args[]) {
        Showable.Message message = new NestedInterfaceTest();
        message.msg();
    }
}
