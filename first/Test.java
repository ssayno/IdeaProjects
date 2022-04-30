public class Test {
    public static void main(String[] args) {
        System.out.println("\033[32mHello, Java\033[0m");
        int ch = 2;
        char test = '\n';
        System.out.println(test);
        switch (ch){
            case 2:{
                System.out.println("The input is two");
                System.out.println("hello");
                break;
            }
            case 1:{
                System.out.println("The input is one");
                break;
            }
            default:{
                System.out.println("No output");
                break;
            }
        }
        String str = "gzl";
        switch (str){
            case "Hello":{
                System.out.println("Hello");
                break;
            }
            case "gzl":{
                System.out.println("hello");
                System.out.println();
                break;
            }
        }
    }
}
