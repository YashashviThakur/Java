
public class CurrentThreadExample extends ThreadExamples {
    public void run(){
            System.out.println("Current Thread Id- "+Thread.currentThread().getId()+": is Running");
            System.out.println("Current Thread Name - "+Thread.currentThread().getName());
            Thread.currentThread().setName("Java-Thread");
            System.out.println("Current Thread New Name - "+Thread.currentThread().getName());
            System.out.println("Current Thread Priority - "+Thread.currentThread().getPriority());
    }
}
