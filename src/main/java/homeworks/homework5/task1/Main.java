package homeworks.homework5.task1;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", 2020);
        Vehicle bicycle = new Bicycle("Giant", 2018);

        car.startEngine();
        car.move();
        System.out.println("----------------------------");
        bicycle.startEngine();
        bicycle.move();

    }
}
