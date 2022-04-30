package work.sayno.www;

public class Person {
    private String name;
    private byte age;
    public Person(){
        System.out.println("开始实例化");
    }
    public Person(String name){
        this();
        this.setName(name);
    }
    public Person(String name, byte age){
        this(name);
        this.setAge(age);
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        if (age < 0){
            System.out.println("\033[31mPlease input the correct age.\nNow, I will set age to 0.\033[0m");
            this.age = 0;
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name is " + this.name + " and age is " + this.age;
    }
}
