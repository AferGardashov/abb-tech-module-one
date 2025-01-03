package homeworks.homework12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final File file = new File("C:\\Users\\009046\\IdeaProjects\\java-abb\\src\\main\\java\\homeworks\\homework12\\student.txt");

    public static void main(String[] args) {
        Main main = new Main();

        main.menuApp();

    }

    public void menuApp() {
        System.out.println("Menu:");
        System.out.println("1. View all records");
        System.out.println("2. Overwrite file with new records");
        System.out.println("3. Append a new record");
        System.out.println("4. Exit");
        System.out.print("Enter operation number: ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int operation = scanner.nextInt();
            scanner.nextLine();
            switch (operation) {
                case 1:
                    readFile();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Writing example: 106,Name,96 ");
                    String input = scanner.nextLine();
                    writeFile(input);
                    System.out.println("Record saved.");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose an option between 1 and 4.");
            }
        }
    }


    private void writeFile(String string) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            fileOutputStream.write((string + "\n").getBytes());
        } catch (IOException exception) {
            System.out.println("Error while writing to the file");
        }
    }

    private void readFile() {
        StringBuilder stringBuilder = new StringBuilder();

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int content;
            while ((content = fileInputStream.read()) != -1) {
                stringBuilder.append((char) content);
            }
        } catch (IOException exception) {
            System.out.println("Error while reading from file");
        }

        String[] array = String.valueOf(stringBuilder).split("\n");

        for (String s : array) {
            String[] arr = s.split(",");
            System.out.println("StudentID: " + arr[0] + ", Name: " + arr[1] + ", Score: " + arr[2]);
        }

    }
}
