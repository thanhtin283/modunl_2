public class MoveablePoint extends Point {
    float xSpeed =0.0f;
    float ySpeed =0.0f;

    public MoveablePoint(float x, float y, float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(){

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    float[] array= new float[2];
    public float[] getSpeed(){
        array[0]=this.xSpeed;
        array[1]=this.ySpeed;
            return array;
    }
    public String toString(){
        return super.toString()
                +","+"speed"+"("+getXSpeed()+","+getYSpeed()+")";
    }
    public void move(){
        this.x+= this.xSpeed;
        this.y+= this.ySpeed;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2,3,12,14);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
