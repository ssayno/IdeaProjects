public class Person {
    private String name;
    private int age;
    private Card card;
    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.setAge(age);
    }
    public Person(String name, int age, Card card){
        this(name, age);
        this.setCard(card);
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
        if (age < 0){
            System.err.println("年龄错误");
        }
        if (age < 18){
            System.err.println("年龄未满 18 岁不允许办理银行卡");
            return;
        }
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
