public class Point2D {
    public float x =0.0f;
    public float y= 0.0f;

    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x =x;
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
        this.x=x;
        this.y=y;
    }
    float[] array= new float[2];
    public float[] getXy(){
        array[0]=this.x;
        array[1]=this.y;
        return array;
    }
    public String duyet2D(){
        getXy();
        String scr ="";
        for (int i=0;i<array.length;i++){
            scr += array[i]+" ";
        }
        return scr;
    }

    @Override
    public String toString(){
        return "("+getX()+","+getY()+")";
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(10,12);
        System.out.println(point2D.toString());

        point2D.setXY(5,6);
        point2D.duyet2D();
        System.out.println(point2D.duyet2D());
    }

}
