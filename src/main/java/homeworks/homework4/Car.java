package homeworks.homework4;

//3.Create a "Car" class.
public class Car {
    String brand;
    String model;
    int yearOfProduction;
    String fuelType;
    double speed;

    public Car(String brand, String model, int yearOfProduction, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
    }

    public void speed(double increment) {
        this.speed += increment;
    }

    public void slow(double decrement) {
        this.speed -= decrement;
    }

    public void stop() {
        this.speed = 0;
    }

    public void checkSpeed(double limit){
        if(this.speed > limit)
            System.out.println("Warning: speed is above the limit");
    }


}
