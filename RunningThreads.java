public class RunningThreads extends Thread {
    public static void main (String srgs[]){
        RunningThreads thread = new RunningThreads();
        thread.start();
        System.out.println("The Code is outside the thread");
    }
    public void run(){
        System.out.println("The code is running in a thread");
    }
}
