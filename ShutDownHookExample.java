public class ShutDownHookExample extends Thread {
    public void run() {
        System.out.println("Shut Down Hook Task Completed");
    }

    public static void main(String[] args) throws Exception {

        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new ShutDownHookExample());

        System.out.println("Main Thread Is Sleeping... Press ctrl+c To Exit Thread");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}