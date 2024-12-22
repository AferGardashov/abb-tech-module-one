package test.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public int count = 0;
    static Lock lock = new ReentrantLock();


    public static void main(String[] args) {

//        Runnable runnable1 = () -> System.out.println("Runnable1");
//        Runnable runnable2 = () -> {
//            for (int i = 0; i < 3; i++) {
//                System.out.println("Runnable2");
//            }
//        };
//
//        Thread thread1 = new Thread(() -> {
//            System.out.println("Salam");
//        });
//        thread1.start();
//
//        new Thread(runnable1).start();
//
//        Thread thread2 = new Thread(runnable2);
//        thread2.setDaemon(true);
//        thread2.start();
//
//        System.out.println("end");



//
//        Runnable runnable3 = () -> {
//            for (int i = 0; i < 2; i++) {
//                System.out.println("Runnable 3");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(runnable3);
//        System.out.println("isShutdown  " + executorService.isShutdown());
//        System.out.println("isTerminated   " + executorService.isTerminated());
//
//        executorService.shutdown();
//        System.out.println("isShutdown  " + executorService.isShutdown());
//        System.out.println("isTerminated  " + executorService.isTerminated());
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("isTerminated  " + executorService.isTerminated());

//        Main main = new Main();
//        ExecutorService executorService = Executors.newFixedThreadPool(20);
//
//        for (int i = 0; i<10; i++){
//            executorService.submit(main::foo);
//        }
//
//        executorService.shutdown();


        new Thread(Main::foo).start();
        new Thread(Main::foo).start();
        new Thread(Main::foo).start();
        new Thread(Main::foo).start();




    }

    public static void foo(){
        lock.lock();
        System.out.println(Thread.currentThread().getName());
    }
}
