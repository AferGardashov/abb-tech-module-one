package homeworks.homework5.task2;

public class Main {

    public static void main(String[] args) {

        CoffeeOrder order1 = new CoffeeOrder(CoffeeType.CAPPUCCINO, CoffeeSize.LARGE);
        CoffeeOrder order2 = new CoffeeOrder(CoffeeType.LATTE, CoffeeSize.MEDIUM);
        CoffeeOrder order3 = new CoffeeOrder(CoffeeType.ESPRESSO, CoffeeSize.SMALL);
        CoffeeOrder order4 = new CoffeeOrder(CoffeeType.ESPRESSO, CoffeeSize.LARGE);
        CoffeeOrder order5 = new CoffeeOrder(CoffeeType.CAPPUCCINO, CoffeeSize.SMALL);

        order1.printOrderDetails();
        System.out.println("-----------------------------");
        order2.printOrderDetails();
        System.out.println("-----------------------------");
        order3.printOrderDetails();
        System.out.println("-----------------------------");
        order4.printOrderDetails();
        System.out.println("-----------------------------");
        order5.printOrderDetails();
        System.out.println("-----------------------------");

        System.out.println("Total : " + order1.calculateTotal() + " $");
    }
}
