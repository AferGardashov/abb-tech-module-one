package test.concurrency;

public class Test {

    public static void main(String[] args) {

        Runnable runnable1 = ()->{
            for (int i = 1; i < 11; i++){
                System.out.println(i+ " ");
            }
        };
        Runnable runnable2 = ()->{
            for (char i = 'A'; i <= 'J'; i++){
                System.out.println(i+ " ");
            }
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();

    }
}
