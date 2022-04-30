package work.sayno.www;

public abstract class Up {
    public static final int EAT = 1;
    public static final int SLEEP = 5;
    public static final int WORK = 10;
    public void command(int code){
        switch (code){
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case EAT + SLEEP + WORK:{
                this.eat();
                this.work();
                this.sleep();
            }
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}
