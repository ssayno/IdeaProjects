package work.sayno.www;

class ReallyPoint <T>{
    private T x;
    private T y;
    public ReallyPoint(){}
    public ReallyPoint(T x, T y){
        this.setX(x);
        this.setY(y);
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ReallyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
