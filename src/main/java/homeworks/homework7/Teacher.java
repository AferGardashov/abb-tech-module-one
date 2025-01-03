package homeworks.homework7;

public class Teacher extends Person {

    private static int personalId = 0;

    private String name;

    private int age;

    public Teacher(String name, int age) {
        super(name, age);
        personalId++;
    }
}
