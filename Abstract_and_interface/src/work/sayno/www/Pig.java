package work.sayno.www;

public class Pig extends Up{

    @Override
    public void eat() {
        System.out.println("啥都吃");
    }

    @Override
    public void sleep() {
        System.out.println("睡猪圈");
    }

    @Override
    public void work() {
        System.out.println("打工，这辈子不可能打工的");
    }
}
