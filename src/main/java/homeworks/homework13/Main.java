package homeworks.homework13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private int count;

    public static void main(String[] args) {

        //TASK 1
        CallTracker tracker = CallTracker.getInstance();
        tracker.increment();
        tracker.increment();

        CallTracker tracker2 = CallTracker.getInstance();
        tracker2.increment();
        tracker2.increment();



        //TASK 2
        Main main = new Main();
        Runnable runnable = main::print;

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(runnable);

        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    public void print() {
        for (int i = 1; i < 9; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }


    }

    public void increment(){
        System.out.println(++count);
    }
}
