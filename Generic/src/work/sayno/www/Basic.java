package work.sayno.www;
import work.sayno.www.*;
public class Basic {
    public static void main(String[] args) {
//        System.out.println("泛型的学习");
//        Point t = new Point(1, 2);
//        System.out.println(t);
//        Point t2 = new Point(1.2, 4.5);
//        System.out.println(t2);
//        Point t3 = new Point("东经112", "北纬20");
//        System.out.println(t3);
//        Point t4 = new Point(1, "北纬23");
//        System.out.println(t4);
//        System.out.println("使用泛型");
//        ReallyPoint<Integer> reallyPoint1 = new ReallyPoint<Integer>(1, 2);
//        System.out.println(reallyPoint1);
//        System.out.println("包装类");
//        Integer ohj = 10;
//        System.out.println(ohj + ohj.toString());
        int x = 128;
        int y = 128;
        System.out.println(true);

    }
    public static void accept(ReallyPoint<?> reallyPoint){
        System.out.println(reallyPoint.getX());
    }
}
