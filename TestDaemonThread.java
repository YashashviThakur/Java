public class TestDaemonThread extends Thread{  
    public void run(){  
     if(Thread.currentThread().isDaemon()){//checking for daemon thread  
      System.out.println("Daemon Thread Running");  
     }  
     else{  
     System.out.println("Thread Running");  
    }  
    }  
    public static void main(String[] args){  
     TestDaemonThread t1=new TestDaemonThread();
     TestDaemonThread t2=new TestDaemonThread();  
     TestDaemonThread t3=new TestDaemonThread();  
     
     t1.setDaemon(true);
       
     t1.start();
     t2.start();  
     t3.start();  
    }  
   }  
