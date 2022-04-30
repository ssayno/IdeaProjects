package work.sayno.www;
import work.sayno.www.*;

import java.util.zip.CheckedOutputStream;

public class Basic {
    public static void main(String[] args) {
        System.out.println("类的基本使用");
        Person person = new Person();
        person.setAge((byte) 127);
        person.setName("周国良");
        System.out.println(person.toString());
        System.out.println(person);
        System.out.println("初始化对象的使用");
        Car bwm = new Car("宝马", 2, 2.3);
        System.out.println(bwm);
        Car bc = new Car();
        System.out.println(bc);
        System.out.println(new Person("周通",  (byte) 21));
        System.out.println(new Car("奔驰", 1, 30));
        System.out.println("Country class useage.");
        Country.setCountry(false);
        Country country1 = new Country("中国", 72);
        Country country2 = new Country("英国", 100);
        Country country3 = new Country("漂亮国", 3);
        System.out.println(country1);
        System.out.println(country2);
        System.out.println(country3);
        Count count1 = new Count();
        System.out.println(count1);
        Count count2 = new Count();
        System.out.println(count2);
        System.out.println(new Count());
        int [] arrays = new int[20];
        for (int x=0,len=arrays.length;x<len;x++){
            System.out.println(arrays[x]);
        }
        System.out.println("www.sayno.work".length());
    }
}
