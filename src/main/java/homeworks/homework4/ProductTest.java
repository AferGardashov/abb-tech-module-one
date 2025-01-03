package homeworks.homework4;

import java.util.Scanner;

// 1.Product Initialization
public class ProductTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the product: ");
        String productName = scanner.nextLine();

        Product product = new Product(productName);
        System.out.println(product);


    }
}
