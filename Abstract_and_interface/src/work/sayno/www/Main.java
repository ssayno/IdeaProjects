package work.sayno.www;

public class Main {
    public static void main(String[] args) {
        System.out.println("设计模板");
        Up reboot = new Reboot();
        reboot.command(Up.EAT);
        Up man = new Man();
        System.out.println("人的操作");
        man.command(Up.SLEEP);
        Up pig = new Pig();
        System.out.println("猪的操作");
        pig.command(Up.WORK);
        Number number = Integer.valueOf(2);
        System.out.println(number.doubleValue());
    }
}
