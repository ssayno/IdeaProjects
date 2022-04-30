package work.sayno.www;

public class Country {
    private String name;
    private int age;
    private static boolean wuchang = true;
    public Country(){}

    public Country(String name, int age){
        this.setAge(age);
        this.setName(name);
    }
    public static void setCountry(boolean c){
       wuchang = c;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static boolean isWuchang() {
        return wuchang;
    }

    public static void setWuchang(boolean wuchang) {
        Country.wuchang = wuchang;
    }

    public String toString(){
        String result = "hello";
        if (Country.isWuchang()){
            result = "是五常";
        }
        return "Country name is " + this.getName() + " age is " + this.getAge() + result;
    }
}
