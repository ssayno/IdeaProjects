package work.sayno.www;

public class Count {
    {
        System.out.println("Test for 构造块");
    }
    private static int count = 0;
    public Count(){
        count++;
    }
    public String toString(){
        return Integer.toString(count);
    }
    public void print(int x){
        if (x > 10){
            System.out.println("x greater than 10");
        }
    }
}
