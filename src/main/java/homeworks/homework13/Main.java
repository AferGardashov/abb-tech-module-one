package homeworks.homework13;

import java.util.concurrent.CyclicBarrier;

public class Main {

    private CyclicBarrier barrier = new CyclicBarrier(2);

    private int count;

    public static void main(String[] args) {

        //TASK 1
//        CallTracker tracker = CallTracker.getInstance();
//        tracker.increment();
//        tracker.increment();
//
//        CallTracker tracker2 = CallTracker.getInstance();
//        tracker2.increment();
//        tracker2.increment();


        //TASK 2
        Main main = new Main();
        Runnable runnable = main::print;

        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    //TASK 2
    public void print() {
        for (int i = 1; i < 9; i++) {
            try {
                barrier.await();
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    //TASK 1
    public void increment() {
        System.out.println(++count);
    }
}
