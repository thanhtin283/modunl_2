public class Point3D extends Point2D {
    public float z =0.0f;
    public Point3D(){
    }
    public Point3D(float x,float y,float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y,float z) {
        super.setXY(x, y);
        this.z=z;
    }
    float[] array =new float[3];
    public float[] getXYZ() {
        array[0]=this.x;
        array[1]=this.y;
        array[2]=this.z;
        return array;
    }
    public String duyet(){
        getXYZ();
        String str ="";
        for (int i=0;i<array.length;i++){
            str += array[i] + " ";
        }
        return str;
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+","+getZ()+")";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(10,12,14);
        System.out.println(point3D);

        point3D.setXYZ(12,3,4);
        point3D.duyet();
        System.out.println(point3D.duyet());
    }

}
