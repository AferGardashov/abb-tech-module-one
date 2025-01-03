package homeworks.homework11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 1
        task1();

        System.out.println();

        //Task 2
        task2();

    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        if (age <= 18) {
            try {
                throw new InvalidInputException();
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Registration success");
        }

    }


    //Task 1
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        while (true) {
            try {
                int input = scanner.nextInt();
                System.out.println("Result: " + input * input);
                break;
            } catch (Exception ex) {
                System.out.println("Unexpected input! Enter a number");
                scanner.nextLine();
            }
        }
    }
}
