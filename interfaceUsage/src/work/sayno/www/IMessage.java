package work.sayno.www;

public interface IMessage {
    public static final String INFO = "http://www.sayno.work";
    public String getInfo();
    public boolean returnBool();
    public default String test(){
        return "Test for JDK test";
    }
}
