
class SychronizedExample {
    synchronized void printSychronizedTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class NonSychronizedExample {
    public void printNonSychronizedTable(int m) {
        for (int j = 1; j <= 5; j++) {
            System.out.println(m * j);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    SychronizedExample t;
    MyThread1(SychronizedExample t) {
        this.t = t;
    }
    public void run() {
        t.printSychronizedTable(5);
    }

}
class MyThread2 extends Thread {
    SychronizedExample t;
    MyThread2(SychronizedExample t) {
        this.t = t;
    }
    public void run() {
        t.printSychronizedTable(100);
    }
}

class MyThread3 extends Thread {
    NonSychronizedExample k;
    MyThread3(NonSychronizedExample k) {
        this.k = k;
    }
    public void run() {
        k.printNonSychronizedTable(5);
    }

}
class MyThread4 extends Thread {
    NonSychronizedExample k;
    MyThread4(NonSychronizedExample k) {
        this.k = k;
    }
    public void run() {
        k.printNonSychronizedTable(100);
    }
}

public class SychronizationExample {
    public static void main(String args[]) {

         // Comment out any object creation code with their respective thread generation start code to know better
        SychronizedExample obj1 = new SychronizedExample();
        System.out.println("Synchronized Thread :");
        MyThread1 t1 = new MyThread1(obj1);
        MyThread2 t2 = new MyThread2(obj1);
        t1.start();
        t2.start();

        // Comment out any object creation code with their respective thread generation start code to know better

        NonSychronizedExample obj2 = new NonSychronizedExample();
        System.out.println("Non Synchronized Thread :");
        MyThread3 t3 = new MyThread3(obj2);
        MyThread4 t4 = new MyThread4(obj2);
        t3.start();
        t4.start();
    }
}
