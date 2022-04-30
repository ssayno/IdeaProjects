package work.sayno.www;

public class Basic {
    public static void main(String[] args) {
        System.out.println("对象的多态性");
        Channel channel = new NetChannel(); // 对象的向上转型
        fun(new NetChannel());
        fun(new Channel());
        fun(new WebChannel());
        System.out.println(channel instanceof NetChannel);
        System.out.println(channel instanceof Channel);
        Channel test = new NetChannel();
        NetChannel netChanneltest = (NetChannel) test;
    }
    public static void fun(Channel channel){
        channel.print();
    }
}
