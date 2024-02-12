public class RunnableThreads implements Runnable {

	public static void main(String[] args)
	{
		RunnableThreads r1 = new RunnableThreads();
        Thread t1 = new Thread(r1,"New Thread");
		t1.start();
		String str = t1.getName();
		System.out.println(str);
    }
    
    public void run()
	{
		System.out.println("Thread is being created and running");
	}

}
