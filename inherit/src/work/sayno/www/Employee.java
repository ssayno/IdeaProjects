package work.sayno.www;

public class Employee {
    private String name;
    private char sex;
    private int age;
    public Employee(){}
    public Employee(String name, char sex, int age){
        this.setAge(age);
        this.setName(name);
        this.setSex(sex);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            this.age = -1;
            System.out.println("Please input correct age");
        }else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
