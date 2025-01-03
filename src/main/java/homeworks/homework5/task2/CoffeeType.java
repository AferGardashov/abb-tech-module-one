package homeworks.homework5.task2;

public enum CoffeeType {

    ESPRESSO{
        @Override
        String getDescription() {
            return "A strong coffee shot.";
        }
    },
    LATTE {
        @Override
        String getDescription() {
            return "A smooth coffee with milk.";
        }
    },
    CAPPUCCINO {
        @Override
        String getDescription() {
            return "A rich and foamy coffee.";
        }
    };

    abstract String getDescription();
}
