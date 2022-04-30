package work.sayno.www;

public abstract class Message {
    private String type;
    public Message(String type){
        this.setType(type);
    }
    public abstract String getConnectInfo();
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public static MySQLMessage returnMySQL(){
        return new MySQLMessage("周通");
    }
}
