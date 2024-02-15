abstract class Person {
    abstract void eat();
}

class TestAnonymousInner {
    public static void main(String args[]) {
        Person p = new Person() {
            void eat() {
                System.out.println("Person Eating Food..");
            }
        };
        p.eat();
    }
}
