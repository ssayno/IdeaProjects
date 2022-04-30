public class Main {
    public static void main(String[] args) {
        System.out.println("开始搭建一个新的银行系统");
        String string = 'a' + 3 + "heihei";
        System.out.println(string);
        Person person = new Person();
        System.out.println(person);
        string = string + person;
        //
        System.err.println("我知道字符串拼接不应该使用 String, 这里只是为了测试 err 的输出和验证字符串等级最高");
        System.out.println(string);
    }
}
