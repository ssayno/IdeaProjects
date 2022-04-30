package work.sayno.www;

public class Anonymous {
    private String msg = "www.sayno.work";
    public void fun(){
        Inner inner = new Inner();
        inner.print();
    }
    class Inner{
        private String info="hello";
        public void print(){
            System.out.println("这是一个内部类");
            System.out.println(Anonymous.this.msg);
        }
    }
}
