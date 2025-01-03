package homeworks.homework5.task1;

public abstract class Vehicle {

    protected String brand;
    protected int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    abstract void startEngine();
    abstract void move();

}
