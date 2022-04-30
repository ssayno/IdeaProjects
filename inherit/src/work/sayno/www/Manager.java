package work.sayno.www;

public class Manager extends Employee{
    private String job;
    private double income;
    public Manager(){}
    public Manager(String name, char sex, int age, String job, double income){
        super(name, sex, age);
        this.job = job;
        this.income = income;
    }
}