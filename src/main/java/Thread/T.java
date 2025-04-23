package Thread;

public class T extends Thread{
    @Override
    public synchronized void run() {
       while (true){
           for (int i = 0; i < 20; i++) {
               System.out.println("current thread :" + Thread.currentThread().getName() + "====" + i);
               try {
                   Thread.sleep(3000);
               }catch (InterruptedException e){
                   e.printStackTrace();
                   System.out.println("child thread was been interrupt");
                   return;
               }
           }

       }
    }
}
