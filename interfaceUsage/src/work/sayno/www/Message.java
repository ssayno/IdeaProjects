package work.sayno.www;

public class Message implements IMessage{
    @Override
    public String getInfo() {
        return "hello, Jvav";
    }

    @Override
    public boolean returnBool() {
        System.out.println(this.INFO.getClass());
//        if (this.INFO.getClass().equals()){
//            return true;
//        }
        return false;
    }
}
