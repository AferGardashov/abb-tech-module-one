package homeworks.homework5.task2;

public enum CoffeeSize {

    SMALL {
        @Override
        double getPrice() {
            return SMALL.price = 2.5;
        }
    }, MEDIUM {
        @Override
        double getPrice() {
            return MEDIUM.price = 3.5;
        }
    }, LARGE {
        @Override
        double getPrice() {
            return LARGE.price = 4.5;
        }
    };

    private double price;

    abstract double getPrice();

}
