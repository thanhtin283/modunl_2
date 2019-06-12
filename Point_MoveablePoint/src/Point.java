public class Point {
    float x =0.0f;
    float y= 0.0f;

    public Point(){
    }
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x= x;
        this.y= y;
    }
    float[] array = new float[2];

    public float[] getArray() {
        array[0]=this.x;
        array[1]=this.y;
        return array;
    }
    public String toString(){
        return "("+getX()+","+getY()+")";
    }

    public static void main(String[] args) {
        Point point =new Point(12,3);
        System.out.println(point);
    }
}
