package work.sayno.www;
import java.util.Arrays;
public class Basic {
    private static String name = "www.sayno.work";
    public static void main(String[] args) {
        System.out.println("关于数组的一些学习");
        int i;
        Integer [] array = new Integer[] {1, 4, 32, 3};
        printArray(array);
        changeArray(array);
        Integer blog_url = new Integer(200);
        System.out.println(blog_url);
        changeUrl(blog_url);
        System.out.println(blog_url);
        printArray(array);
        System.out.println("二位数组的定义和使用");
        System.out.println("动态二维数组的定义和使用");
        Integer [][] tArray = new Integer[2][3];
        for (Integer []hang :
                tArray) {
            for (Integer item :
                    hang) {
                System.out.println(item);
            }
        }
        System.out.println("静态二维数组的的的定义和输出");
        Integer [][] jtArray = new Integer[][] {{1,2,3}, {3,4}};
        for(Integer[] hang: jtArray){
            for(Integer item: hang){
                System.out.println(item);
            }
        }
        printArray(returnArray());
        System.out.println(sum(1, 2, 3, 0));
    }
    public static void changeArray(Integer [] array){
        System.out.println(name);
        array[0] = 300;
    }
    public static void printArray(Integer [] array){
        for (int x=0,len=array.length;x<len;x++){
            System.out.println(array[x]);
        }
        System.out.println("For-each 循环输出");
        for (Integer item :array) {
            System.out.println(item);
        }
    }
    public static void changeUrl(Integer url){
        url = 300;
    }
    public static Integer[] returnArray(){
        Integer[] array = new Integer[] {1, 3, 5, 7, 9};
        return array;
    }
    public static int sum(int ... data){
        int sum=0;
        for(int item :data){
            sum += item;
        }
        return sum;
    }
}
