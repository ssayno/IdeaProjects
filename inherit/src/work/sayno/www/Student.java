package work.sayno.www;

import java.util.Objects;

public class Student extends Person{
    private int math;
    private int English;
    public Student(){}
    public Student(int math, int English){
        this.setEnglish(English);
        this.setMath(math);
    }
    public Student(String name, String address, char sex, int age, int math, int English){
        super(name, address, sex, age);
        this.setMath(math);
        this.setEnglish(English);
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return English;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "math=" + math +
                ", English=" + English +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.math == student.math && this.English == student.English;
    }

    @Override
    public int hashCode() {
        return Objects.hash(math, English);
    }
}
