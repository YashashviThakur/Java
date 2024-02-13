
public class Multithreading extends Thread{
    public static void main(String[] args) {
        JoiningThread t1 = new JoiningThread();
        JoiningThread t2 = new JoiningThread();
        JoiningThread t3 = new JoiningThread();
        t1.start();
        try{
            System.out.println("Current Thread : "+Thread.currentThread().getName());
            System.out.println(t1.getState());
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();
        try{
            System.out.println("Current Thread : "+Thread.currentThread().getName());
            System.out.println(t2.getState());
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
