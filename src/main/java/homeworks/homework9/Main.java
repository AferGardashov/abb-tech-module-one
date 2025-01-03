package homeworks.homework9;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Map<String, Student> map = new HashMap<>();

        Student student1 = new Student("Student1", 85, 75, 90);
        Student student2 = new Student("Student2", 55, 70, 85);
        Student student3 = new Student("Student3", 95, 90, 100);
        Student student4 = new Student("Student4", 40, 60, 70);
        Student student5 = new Student("Student5", 50, 95, 55);

        map.put("Student1", student1);
        map.put("Student2", student2);
        map.put("Student3", student3);
        map.put("Student4", student4);
        map.put("Student5", student5);

        System.out.println("Sorted by grade: ");
        List<Student> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for (Student s : list){
            System.out.println(s);
        }

        System.out.println("Sorted by names: ");
        Collections.sort(list, comparator);
        for (Student s : list){
            System.out.println(s);
        }

    }
}
