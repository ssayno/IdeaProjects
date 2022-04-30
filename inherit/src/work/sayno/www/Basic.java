package work.sayno.www;

public class Basic {
    public static void main(String[] args) {
        System.out.println("基本继承的学习");
        Student zgl = new Student("周国良", "湘潭大学", '男', 20, 150, 150);
        Student zgl2 = new Student("周国良", "湘潭大学", '男', 20, 150, 150);
        System.out.println(zgl.equals(zgl2));
        System.out.println(zgl.getClass());
    }
    public static void print(){
        System.out.println("Hello, IDEA");
    }
    public static void print(String  name){
        System.out.println("Hello, " + name);
    }
}
