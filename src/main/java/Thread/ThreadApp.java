package Thread;

public class ThreadApp {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("Mata");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        for (int i = 0; i < 5; i++){
            Thread.sleep(1000);



            System.out.println("mian thread===" + Thread.currentThread().getName() + "====" + i);
        }
        t.interrupt();

    }
}
