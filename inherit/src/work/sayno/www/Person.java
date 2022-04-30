package work.sayno.www;

public class Person {
    private String name;
    private String address = "湘潭大学";
    private char sex = '男';
    private int age = 18;
    public Person(){}
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public Person(String name, String address, char sex, int age){
        this(name, age);
        this.setAddress(address);
        this.setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
