
public class JoiningThread extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            try{
                Thread.sleep(1000);
                System.out.println("Current Thread : "+Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
