package homeworks.homework5.task2;

public class CoffeeOrder {
    private CoffeeType type;
    private CoffeeSize size;

    private static double total;

    public CoffeeOrder(CoffeeType type, CoffeeSize size) {
        this.type = type;
        this.size = size;
        total += size.getPrice();
    }

    public void printOrderDetails(){
        System.out.println("Coffee type : " + type + "\nDescription : " + type.getDescription() + "\nSize : " + size + "\nPrice : " + size.getPrice());
    }

    public double calculateTotal(){
        return total;
    }
}
