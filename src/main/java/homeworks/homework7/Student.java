package homeworks.homework7;

public class Student extends Person {

    private static int personalId = 0;

    private String name;

    private int age;

    public Student(String name, int age) {
        super(name, age);
        personalId++;
    }

}
