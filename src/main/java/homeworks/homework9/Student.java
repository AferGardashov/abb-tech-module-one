package homeworks.homework9;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;

    private int mathGrade;

    private int scienceGrade;

    private int englishGrade;

    public Student(String name, int mathGrade, int scienceGrade, int englishGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
    }

    public int getTotalGrade() {
        return (mathGrade + scienceGrade + englishGrade) / 3;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name + " -> grade: " + getTotalGrade();
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return this.name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mathGrade, scienceGrade, englishGrade);
    }

    @Override
    public int compareTo(Student s) {
        return this.getTotalGrade() > s.getTotalGrade() ? -1 : (this.getTotalGrade() == s.getTotalGrade() ? 0 : 1);
    }


}
