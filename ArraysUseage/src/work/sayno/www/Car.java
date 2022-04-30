package work.sayno.www;

public class Car {
    private String name;
    private double price;
    public Car(){}
    public Car(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }

    public String toString(){
        return "车名：" + this.name + "；车的价值：" + this.price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
