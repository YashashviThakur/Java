
import java.util.*;

public class ThreadExamples {
    public static void main(String[] args) {
        System.out.println("Thread Name - "+Thread.currentThread().getName());
        System.out.println("Started");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for(int i=0;i<a;i++){
            CurrentThreadExample obj = new CurrentThreadExample();
            obj.run();
        }
    } 
}
