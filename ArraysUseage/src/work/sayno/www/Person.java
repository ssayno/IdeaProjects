package work.sayno.www;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private Car car;
    private ArrayList<Person> brother = new ArrayList<Person>();
    public Person(){}
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public Person(String name, int age, Car car){
        this.setName(name);
        this.setAge(age);
        this.setCar(car);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ArrayList<Person> getBrother() {
        return brother;
    }

    public void setBrother(Person person) {
        this.brother.add(person);
    }

    public String toString(){
        ArrayList<Person> temp = this.getBrother();
        StringBuffer brother_name = new StringBuffer();
        for (Person item:temp){
            brother_name.append(item.getName()).append("、");
        }
        return "名字：" + this.getName() + " 年龄：" + this.getAge() + " 汽车" + this.getCar() +
        " 兄弟：" + brother_name;
    }
}
