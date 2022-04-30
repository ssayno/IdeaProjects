package work.sayno.www;

public class AbstractUsage {
    public static void main(String[] args) {
        System.out.println("抽象类的学习");
        Message message = Message.returnMySQL();
        System.out.println(message.getConnectInfo());
        message.setType("周国良");
        System.out.println(message.getConnectInfo());
    }
}
