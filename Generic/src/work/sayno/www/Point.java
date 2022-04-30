package work.sayno.www;

public class Point {
    private Object x;
    private Object y;
    public Point(){}
    public Point(Object x, Object y){
        this.setX(x);
        this.setY(y);
    }
    public String toString(){
        return "坐标为：(" + this.x + ", " + this.y + ")";
    }

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}
