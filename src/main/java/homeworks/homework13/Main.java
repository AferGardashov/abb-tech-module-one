package homeworks.homework13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    CyclicBarrier barrier = new CyclicBarrier(2);
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

    public void increment() {
        System.out.println(++count);
    }
}
