package homeworks.homework5.task1;

public class Car extends Vehicle {

    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    void startEngine() {
        System.out.println("The car's engine roars to life!");
    }

    @Override
    void move() {
        System.out.println("The car drives down the road.");
    }
}
