package work.sayno.www;

public class Basic {
    public static void main(String[] args) {
        System.out.println("接口的学习");
        IMessage iMessage = new Message();
        System.out.println(iMessage.getInfo());
        System.out.println(iMessage.INFO);
        System.out.println(iMessage.returnBool());
        System.out.println(iMessage.test());
    }
}
