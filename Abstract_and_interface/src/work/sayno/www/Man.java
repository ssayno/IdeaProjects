package work.sayno.www;

public class Man extends Up{

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("睡床上");
    }

    @Override
    public void work() {
        System.out.println("一天工作 8 个小时");
    }
}
