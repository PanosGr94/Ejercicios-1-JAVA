package src.ex5;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Panos on 22-Feb-16.
 */
public class runnableThread implements Runnable {

    private long lastTime = System.currentTimeMillis();

    public void myMessage(int vez){
        long dt= System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();
        String name = Thread.currentThread().getName();
        System.out.println("Name: " +name +"  Time(ms) From Last Output: " +dt +"   Output Number: " +vez);

    }

    public void run() {
        try {
            for (int i = 0;i < 10; i++) {
                myMessage(i+1);
                long interval = (long) (1000*( ThreadLocalRandom.current().nextDouble(0.0,2.0) ));
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            System.out.println("You interrupted runnableThread");
        }
    }

            //Code for starting thread
            // (new Thread(new runnableThread())).start();


}