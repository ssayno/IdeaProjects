package work.sayno.www;

public class Reboot extends Up{
    @Override
    public void eat() {
        System.out.println("喝机油");
    }
    @Override
    public void work(){
        System.out.println("不知疲倦的工作");
    }
    @Override
    public void sleep(){
        System.out.println("不要睡觉");
    }
}
