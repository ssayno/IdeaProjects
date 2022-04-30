package work.sayno.www;

public class Basic {
    public static void main(String[] args) {
        System.out.println("命令行参数的输出");
        for(String arg:args){
            System.out.println(arg);
        }
        System.out.println("字符串的基本使用");
        String strA = "www.sayno.work";
        String strB = "www.sayno.work";
        String strC = new String("www.sayno.work");
        System.out.println(strA == strB);
        System.out.println(strA.equals(strC));
        System.out.println(strA == strC);
        System.out.println(strA == strC);
        String strD = new String("www.sayno.work").intern();
        System.out.println(strA == strD);
        System.gc();
    }
}
