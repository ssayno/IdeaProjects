package work.sayno.www;

public class MySQLMessage extends Message{
    public MySQLMessage(String str){
        super(str);
    }
    @Override
    public String getConnectInfo() {
        return this.getType() + this.getClass();
    }
}
