class StaticSynchronizedTable{  
  
    synchronized static void printStaticTable(int n){  
      for(int i=1;i<=10;i++){  
        System.out.println(n*i);  
        try{  
          Thread.sleep(100);  
        }catch(Exception e){
            e.printStackTrace();
        }  
      }  
    }  
   }  
     
   public class StaticSynchronization extends Thread{  
   public static void main(String[] args) {  
         
       Thread t1=new Thread(){  
           public void run(){  
            StaticSynchronizedTable.printStaticTable(1);  
           }  
       };  
         
       Thread t2=new Thread(){  
           public void run(){  
            StaticSynchronizedTable.printStaticTable(10);  
           }  
       };  
         
       Thread t3=new Thread(){  
           public void run(){  
            StaticSynchronizedTable.printStaticTable(100);  
           }  
       };  
         
       Thread t4=new Thread(){  
           public void run(){  
            StaticSynchronizedTable.printStaticTable(1000);  
           }  
       };  
       
       t1.start();  
       t2.start();  
       t3.start();  
       t4.start();  
         
   }  
   }  