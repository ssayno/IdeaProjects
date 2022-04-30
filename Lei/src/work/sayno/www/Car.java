package work.sayno.www;

public class Car {
    private String name;
    private int carAge;
    private double worth;
    public Car(){}
    public Car(String name, int carAge, double worth){
        this.name = name;
        this.carAge = carAge;
        this.worth = worth;
    }
    public String toString(){
        return "Car Name is " + this.name + ". Car use age is " + this.carAge + " and car's worth is " +  this.worth + "(万";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
