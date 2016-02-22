package src.ex5;

/**
 * Created by Panos on 22-Feb-16.
 */
public class Threads {

    public long startTime = System.currentTimeMillis();

   public static void main(String args[]) throws InterruptedException {
       Thread thread1 = new Thread(new runnableThread());
       Thread thread2 = new mySubThread();
       thread1.start();
       thread2.start();

       thread1.join();
       thread2.join();
       System.out.println("Se Acabo.");
   }
}
