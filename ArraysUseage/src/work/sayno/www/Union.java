package work.sayno.www;

public class Union {
    public static void main(String[] args) {
        System.out.println("类关联结构");
        Person zgl = new Person("周国良", 20);
        System.out.println("生成汽车");
        Car bwm = new Car("宝马", 200000);
        System.out.println(zgl.getCar());
        System.out.println("绑定汽车");
        zgl.setCar(bwm);
        System.out.println(zgl.getCar());
        System.out.println("连接好兄弟");
        Person zt = new Person("周通", 21);
        System.out.println("兄弟买车");
        Car kln = new Car("库里南", 1000000);
        zt.setCar(kln);
        System.out.println("连接好兄弟");
        System.out.println(zgl.getBrother());
        zgl.setBrother(zt);
        System.out.println(zgl.getBrother());

        Person zy = new Person("周x", 21);
        System.out.println("兄弟买车");
        Car kln2 = new Car("库里南2", 1000000);
        zy.setCar(kln2);
        zgl.setBrother(zy);
        for(Person temp: zgl.getBrother()){
            System.out.println(temp.getCar());
        }
    }
}
